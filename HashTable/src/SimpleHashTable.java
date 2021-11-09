public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey; //to check whether it loops and come backs to same index
            //if the first position we check is the last index loop
            if (hashedKey == hashtable.length-1) {
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }
            // if need a second probing
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey+1) % hashtable.length;
            }
        }
        if (occupied(hashedKey)){
            System.out.println("There's already an employee at postion "+ hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashkey = findKey(key);
        if (hashkey == -1) {
            return null;
        }
        return hashtable[hashkey].employee;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey; //to check whether it loops and come backs to same index
        //if the first position we check is the last index loop
        if (hashedKey == hashtable.length-1) {
            hashedKey = 0;
        }
        else {
            hashedKey++;
        }
        // if need a second probing
        while ((hashedKey != stopIndex) && (hashtable[hashedKey]!=null) && (!hashtable[hashedKey].key.equals(key))) {
            hashedKey = (hashedKey+1) % hashtable.length;
        }
        if ((hashtable[hashedKey]!=null) && (hashtable[hashedKey].key.equals(key))){
            return hashedKey;
        }
        else {
            return -1;
        }
    }

    public void printHashtable() {
        for (StoredEmployee e : hashtable) {
            if (e == null) {
                System.out.println("empty");
            } else {
                System.out.println(e.employee);
            }
        }
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for (int i=0; i<oldHashtable.length; i++) {
            if (oldHashtable[i]!=null) {
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }
        return employee;
    }
}

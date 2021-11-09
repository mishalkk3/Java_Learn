public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marrySmith = new Employee("Marry", "Smith",22);
        Employee mikeWilson = new Employee("Mike", "Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones",janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("End", billEnd);
        hashTable.put("Smith", marrySmith);

        hashTable.printHashtable();
        System.out.println("-------------------------------------------------------");

        System.out.println(hashTable.get("Wilson"));
        System.out.println("-------------------------------------------------------");

        System.out.println(hashTable.remove("Wilson"));
        System.out.println(hashTable.remove("Jones"));
        System.out.println("-------------------------------------------------------");
        hashTable.printHashtable();
        System.out.println("-------------------------------------------------------");
        System.out.println(hashTable.get("Smith"));
        System.out.println("-------------------------------------------------------");
    }
}

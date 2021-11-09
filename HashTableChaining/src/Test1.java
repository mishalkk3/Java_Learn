import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marrySmith = new Employee("Marry", "Smith",22);
        Employee mikeWilson = new Employee("Mike", "Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones",janeJones);
        hashMap.put("Doe",johnDoe);
        hashMap.put("Smith",marrySmith);
        hashMap.put("Doe", mikeWilson);
        hashMap.putIfAbsent("Doe",johnDoe); // only replace if the space is empty
        System.out.println(hashMap.get("SomeOne"));
        System.out.println(hashMap.getOrDefault("someone",mikeWilson));

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
        hashMap.forEach((k,v)-> System.out.println("Key = "+k+", "+v));
        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));
    }
}

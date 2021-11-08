package LearnList;

import java.util.Iterator;
import java.util.LinkedList;

public class ListMain {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marrySmith = new Employee("Marry", "Smith",22);
        Employee mikeWillson = new Employee("Mike", "Willson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marrySmith);
        list.addFirst(mikeWillson);
        list.add(billEnd); //add to last
        list.removeFirst();

        Iterator itr = list.iterator();
        System.out.print("Head -> ");
        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(" <=> ");
        }
        System.out.println("NULL");
    }
}

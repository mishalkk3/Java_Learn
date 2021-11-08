package LearnList.LearnDoubleLinkedList;

import LearnList.Employee;

public class DLinkedList {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marrySmith = new Employee("Marry", "Smith",22);
        Employee mikeWillson = new Employee("Mike", "Willson",3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marrySmith);
        list.addToFront(mikeWillson);

        list.printList();
        System.out.println(list.getSize());
        System.out.println();

        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        System.out.println();

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        System.out.println();

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
        System.out.println();

        list.addBefore(new Employee("Some","One",111),marrySmith);
        list.printList();
        System.out.println(list.getSize());
        System.out.println();
    }
}

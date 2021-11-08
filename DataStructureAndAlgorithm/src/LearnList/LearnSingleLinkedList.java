package LearnList;

public class LearnSingleLinkedList {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marrySmith = new Employee("Marry", "Smith",22);
        Employee mikeWillson = new Employee("Mike", "Willson",3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marrySmith);
        list.addToFront(mikeWillson);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());        list.printList();
    }
}

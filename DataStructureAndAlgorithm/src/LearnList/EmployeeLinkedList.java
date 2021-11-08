package LearnList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public int getSize(){
        return size;
    }

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty())
            return null;
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current!=null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public boolean isEmpty(){
        return head==null;
    }
}
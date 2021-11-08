public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marrySmith = new Employee("Marry", "Smith",22);
        Employee mikeWillson = new Employee("Mike", "Willson",3245);

        LinkListStack stack = new LinkListStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marrySmith);
        stack.push(mikeWillson);

        stack.printStack();
        System.out.println("-------------------------------------------------------");

        System.out.println(stack.peek());
        System.out.println("-------------------------------------------------------");
        stack.pop();
        stack.printStack();
        System.out.println("-------------------------------------------------------");
        ;


        /* Stack using array
        ArrayStack stack = new ArrayStack(10);
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marrySmith);
        stack.push(mikeWillson);

        stack.printStack();

        System.out.println("-------------------------------------------------------");

        System.out.println(stack.peek());

        System.out.println("-------------------------------------------------------");

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        System.out.println("-------------------------------------------------------");

	 */

    }
}

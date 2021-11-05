package ExcpHandle;

public class Test1 {
    /* 1. public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        try {
            //String str = null;
            //System.out.println(str.length());
            int[] i = {1,2};
            int num = i[3];
            System.out.println("Method2 Ended");
        } catch (NullPointerException ex){
            System.out.println("This is a Null Pointer Exception");
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } */
    /* 2. public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[2];
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Before Scanner close");
            scanner.close();
        }
        System.out.println("End of main method");
    }
     */
    /* 3. public static void main(String[] args) {
        try {
            someOtherMethod();
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //someOtherMethod();
        //someOtherMethod2();
        System.out.println("ALL DONE!!");
    }

    private static void someOtherMethod2() throws RuntimeException {
    }

    private static void someOtherMethod() throws InterruptedException{
        Thread.sleep(1000);
    }
     */
    /* 4.
     */
}

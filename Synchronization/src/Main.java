public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Sample obj1 = new Sample();
        Thread t1 = new MyThread(obj1);
        Thread t2 = new MyThread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj1.getX());
    }
}

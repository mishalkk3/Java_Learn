class MyThread1 extends Thread{
    public void run() {
        for (;;) {
            if (interrupted()) {
                System.out.println("\nStopping the thread");
                break;
            }
            System.out.print("T");
        }
    }
}

public class StopThread {
    public static void main(String[] args) {
//        System.out.println("Line1");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Line2");

        MyThread1 thr = new MyThread1();
        thr.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thr.interrupt();
    }
}

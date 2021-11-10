class MyTask2 implements Runnable{

    @Override
    public void run() {
        for (;;) {
            System.out.print("T");
        }
    }
}

public class DaemonTst {
    public static void main(String[] args) {
        Thread thr = new Thread(new MyTask2());
        thr.setDaemon(true);
        thr.start();

        for (int i=1; i<=1000; i++) {
            System.out.print("M");
        }
    }
}

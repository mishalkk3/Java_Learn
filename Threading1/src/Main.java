class MyThread extends Thread{
    public void run() {
        for (int i=1; i<=1500; i++){
            System.out.print("T");
        }
    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<=1500; i++){
            System.out.print("-");
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread thr = new MyThread();
        thr.start();

        MyTask task1 = new MyTask();
        Thread thr2 = new Thread(task1);
        thr2.start();

        for (int i=1; i<=1500; i++){
            System.out.print("M");
        }
    }
}

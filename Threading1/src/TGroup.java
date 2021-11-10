class MyTask1 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TGroup {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("MyThreadGroup");
        myGroup.setMaxPriority(7);

        Thread myThread = new Thread(myGroup ,new MyTask1(), "Demo Thread");
        myThread.start();
        System.out.println("System Threads..........................");
        Thread thr = Thread.currentThread();
        ThreadGroup grp = thr.getThreadGroup();
        while (grp.getParent()!=null)
            grp=grp.getParent();
        grp.list();
    }
}

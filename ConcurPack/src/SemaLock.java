import java.util.concurrent.Semaphore;

class PrintThread extends Thread {
    int id;
    Semaphore semaphore;

    public PrintThread(int id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            //Critical Section
            System.out.println("Printer "+id+" is printing....");
            Thread.sleep(2000);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaLock {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new PrintThread(1,semaphore).start();
        new PrintThread(2,semaphore).start();
        new PrintThread(3,semaphore).start();
        new PrintThread(4,semaphore).start();

    }
}

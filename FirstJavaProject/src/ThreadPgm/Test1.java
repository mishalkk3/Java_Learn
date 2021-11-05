package ThreadPgm;

class Task1 extends Thread {
    public void run(){
        System.out.println("Task 1 Starts");
        for(int i=101;i<=199;i++)
            System.out.print(i + " ");
        System.out.println("\nTask 1 Done");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 2 Starts");
        for(int i=201;i<=299;i++)
            System.out.print(i + " ");
        System.out.println("\nTask 2 Done");
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task1 kicked off");
        Task1 task1 = new Task1();
        task1.start();

        System.out.println("Task2 kicked off");
        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.start();

        task1.join();

        System.out.println("Task3 kicked off");
        for(int i=301;i<=399;i++)
            System.out.print(i + " ");
        System.out.println("\nTask 3 done");
        System.out.println("All tasks done");
    }
}

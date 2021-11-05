package ThreadPgm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

    private int num;

    public Task(int num) {
        this.num = num;
    }

    public void run(){
        System.out.println("\nTask "+num+" Starts");
        for(int i=num*100;i<=num*100+99;i++)
            System.out.print(i + " ");
        System.out.println("\nTask "+num+" Done");
    }
}

public class Test2 {
    public static void main(String[] args) {
        ExecutorService exc1 = Executors.newFixedThreadPool(2);
        exc1.execute(new Task(1));
        exc1.execute(new Task(2));
        exc1.execute(new Task(3));
        exc1.execute(new Task(4));

        exc1.shutdown();
    }
}

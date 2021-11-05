package ThreadPgm;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name;
    }
}


public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exc1 = Executors.newFixedThreadPool(1);
        Future<String> welcome = exc1.submit(new CallableTask("Mishal"));
        System.out.println("Mishal Callable completed");
        String name = welcome.get();
        System.out.println(name);
        System.out.println("Main completed");
    }
}

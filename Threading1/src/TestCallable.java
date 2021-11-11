import java.util.concurrent.*;

class MyMath {
    public static int add(int a, int b) {
        return a + b;
    }
}

class AddTask implements Callable<Integer> {
    int x;
    int y;

    public AddTask(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() {
        int result = MyMath.add(x,y);
        return result;
    }
}

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int x = 10;
        int y = 20;

        ExecutorService executor = Executors.newFixedThreadPool(1);

//        Future<Integer> future = executor.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return MyMath.add(x,y);
//            }
//        });

        Future<Integer> future = executor.submit(new AddTask(x,y));
        while (future.isDone()); //wait

        int z = future.get();
        System.out.println("Result = "+z);
        executor.shutdown();
    }
}

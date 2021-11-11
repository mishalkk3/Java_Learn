import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class SharedService {
    static AtomicBoolean initialized= new AtomicBoolean(false);

    public void init() {
        if (!initialized.compareAndSet(false,true)) {
            System.out.println("Already Initialized");
            return;
        }
        System.out.println("Initializing.....");
    }

    public void service() {
        init();
        System.out.println("Perform Task");
    }
}


public class AtomicTypeEx {
    public static void main(String[] args) {
        SharedService service = new SharedService();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i=1; i<=3; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    service.service();
                }
            });
        }
        executor.shutdown();
















//        AtomicInteger value = new AtomicInteger(10);
//        boolean status = value.compareAndSet(20,11);
//        if (status==true) {
//            System.out.println("Set");
//        } else {
//            System.out.println("Not Set");
//        }
    }
}

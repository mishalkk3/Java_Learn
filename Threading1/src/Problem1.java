import Utils.PatternFinder;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

public class Problem1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String pattern = "mighty";

        File dir = new File("./sample");
        File[] files = dir.listFiles();

        PatternFinder finder = new PatternFinder();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Map<String, Object> resultMap = new HashMap<String,Object>();

        long startTime = System.currentTimeMillis();

        for (File file : files){
            Future<List<Integer>> future = executor.submit(new Callable<List<Integer>>() {
                @Override
                public List<Integer> call() throws Exception {
                    List<Integer> lineNumbers = finder.find(file, pattern);
                    return lineNumbers;
                }
            });
            resultMap.put(file.getName(), future);
        }
        waitForAll(resultMap);
        for (Map.Entry<String, Object> entry: resultMap.entrySet()) {
            System.out.println("Pattern"+entry.getValue()+" In "+entry.getKey());
        }
        System.out.println((System.currentTimeMillis() - startTime));
        executor.shutdown();
    }

    private static void waitForAll(Map<String, Object> resultMap) throws ExecutionException, InterruptedException {
        Set<String> keys = resultMap.keySet();
        for (String key : keys){
            Future<List<Integer>> future = (Future<List<Integer>>) resultMap.get(key);
            while (!future.isDone());
            resultMap.put(key,future.get());
        }
    }
}

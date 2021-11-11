import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CopyTask implements Runnable {
    String srcFile;
    String destFile;

    public CopyTask(String srcFile, String destFile){
        this.srcFile = srcFile;
        this.destFile = destFile;
    }

    @Override
    public void run() {
        try {
            IOUtility.copyFile(srcFile, destFile);
            System.out.println("Copied from "+srcFile+" to "+destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class PllCopyFile {

    public static void main(String[] args) throws IOException {

        String sourceFile1 = "sample/a.txt";
        String sourceFile2 = "sample/b.txt";

        String destFile1 = "sample/c.txt";
        String destFile2 = "sample/d.txt";

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new CopyTask(sourceFile1,destFile1));
        executor.execute(new CopyTask(sourceFile2, destFile2));

//        Thread t1 = new Thread(new CopyTask(sourceFile1,destFile1));
//        Thread t2 = new Thread(new CopyTask(sourceFile2, destFile2));
//        t1.start();
//        t2.start();
        executor.shutdown();
    }
}
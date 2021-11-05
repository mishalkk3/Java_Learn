import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path cwd = Paths.get("./resources/data1.txt");
        List<String> list = List.of("Apple","Boy","Cat","Dog","Ant");
        Files.write(cwd,list);

    }
}

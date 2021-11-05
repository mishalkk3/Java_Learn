import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Path cwd = Paths.get(".");
        Files.list(cwd).forEach(file -> System.out.println(file));
        System.out.println("------------------------------------------------------------------------------------");
        //Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(cwd,2).filter(path -> String.valueOf(path).contains(".java")).forEach(file -> System.out.println(file));
        System.out.println("------------------------------------------------------------------------------------");
        //BiPredicate<Path, BasicFileAttributes> matcher = ((path, basicFileAttributes) -> String.valueOf(path).contains(".java"));
        Files.find(cwd,2, (path, basicFileAttributes) -> String.valueOf(path).contains(".java")).forEach(file -> System.out.println(file));
        System.out.println("------------------------------------------------------------------------------------");
        //BiPredicate<Path, BasicFileAttributes> dirmatcher = ((path, basicFileAttributes) -> basicFileAttributes.isDirectory());
        Files.find(cwd,2, (path, basicFileAttributes) -> basicFileAttributes.isDirectory()).forEach(file -> System.out.println(file));

        /* Path cwd = Paths.get("./resources/data.txt");

        List<String> lines = Files.readAllLines(cwd);
        System.out.println(lines);
        System.out.println("-----------------------------------------------------------------------");
        Files.lines(cwd).map(String::toLowerCase).filter(s -> s.contains("a")).forEach(System.out::println);
         */

        /*
         */
    }
}

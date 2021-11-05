package FuncionalProgramming;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = List.of(23,45,67,12).stream().filter(e -> e%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0);
        System.out.println(n);
    }
}

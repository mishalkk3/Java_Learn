package FuncionalProgramming;

import java.util.List;

public class test1 {
    public static void main(String[] args) {
    /* 1.    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        printBasic(list);
        System.out.println("-----------------------------------------------------");
        printat(list);
    }

    private static void printBasic(List<String> list){
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }

    private static void printat(List<String> list){
        list.stream().filter(item -> item.endsWith("at"))
                .forEach(element -> System.out.println(element));
    } */

    /* 2. List<Integer> list = List.of(1,4,7,9);
       list.stream().forEach(item -> System.out.println(item));
       System.out.println("------------------------------------------------");
       list.stream().filter(item -> item%2 == 1).forEach(item -> System.out.println(item));
     */

    /* 3. List<Integer> numbers = List.of(4,6,8,13,3,15);
       int sum = numbers.stream().filter(item -> item%2 == 1).reduce(0, (num1,num2)->num1+num2);
       System.out.println(sum);
     */

        /* 4. List<Integer> numbers = List.of(3,5,8,213,7,3,45,4,7);
       numbers.stream().distinct().map(e -> e*e).forEach(item -> System.out.println(item));
       List.of("Apple", "AnT", "BAt").stream().map(s -> s.toLowerCase()).forEach(e -> System.out.println(e));
       List.of("Apple", "AnT", "BAt").stream().map(s -> s.length()).forEach(e -> System.out.println(e));
       int n = List.of(23,12,34,53).stream().max((n1,n2)->Integer.compare(n1,n2)).get();
       List list1 = List.of(23,12,34,53).stream().filter(e->e%2==1).collect(Collectors.toList());
       List list1 = IntStream.range(1,11).map(e ->e*e).boxed().collect(Collectors.toList());
         */

        /* 5. OPTIONAL CLASS
        int n = List.of(23,45,67,12).stream().filter(e -> e%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0);

         */
    }
}

package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericRunner {

    static <X> X doSomething(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    public static void main(String[] args) {

        /*System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.2,2.3,3.4,4.5,5.6)));

        String va1 = doSomething(new String());
        Integer num1 = doSomething(Integer.valueOf(5));
        ArrayList ls1 = doSomething(new ArrayList());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicate(numbers);
        System.out.println(numbers); */

        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);

        MyCustomList<Integer> list1 = new MyCustomList<>();
        list1.addElement(Integer.valueOf(5));
        list1.addElement(Integer.valueOf(7));
        Integer number = list1.get(0);

        System.out.println(value);
        System.out.println(list);
        System.out.println(number);
        System.out.println(list1);
    }
}

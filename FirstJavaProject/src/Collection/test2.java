package Collection;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(),value2.length());
    }
}

public class test2 {
    public static void main(String[] args) {
        Queue<String> que = new PriorityQueue<>(new StringLengthComparator());
        que.offer("Apple");
        que.addAll(List.of("Zebra","Monkey","Cat"));
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
    }
}

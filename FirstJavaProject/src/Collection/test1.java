package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> wordsList = List.of("Apple", "Bat","Jam", "Cat", "Cake");
        List<String> words = new ArrayList<>(wordsList);

        Iterator<String> itr = words.iterator();
        while (itr.hasNext()){
            if (itr.next().endsWith("at")){
                itr.remove();
            }
        }
        System.out.println(words);
    }
}

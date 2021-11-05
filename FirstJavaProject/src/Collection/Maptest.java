package Collection;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {
        String str = "this is an awsome occasion this has never happened before";

        char[] letters = str.toCharArray();
        String[] words = str.split(" ");

        Map<Character, Integer> occurance = new HashMap<>();
        Map<String, Integer> stringOccurance = new HashMap<>();

        for(char letter : letters){
            Integer value = occurance.get(letter);
            if(value == null) {
                occurance.put(letter, 1);
            }
            else {
                occurance.put(letter,value+1);
            }
        }

        for(String word : words){
            Integer value = stringOccurance.get(word);
            if(value == null){
                stringOccurance.put(word, 1);
            }
            else {
                stringOccurance.put(word, value+1);
            }
        }

        System.out.println(occurance);
        System.out.println(stringOccurance);
    }
}

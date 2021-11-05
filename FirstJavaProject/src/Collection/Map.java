package Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = java.util.Map.of("A",3,"B",5,"Z",10);
        System.out.println();

        java.util.Map<String, Integer> hashmap = new HashMap<>(map);
        hashmap.put("F",5);
        System.out.println(hashmap);
        hashmap.put("Z", 12);
        System.out.println(hashmap);
        System.out.println();

        TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        treeMap.put("L", 250);
        System.out.println(treeMap);
    }
}

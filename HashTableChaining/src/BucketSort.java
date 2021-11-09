import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i : intArray)
            System.out.println(i);
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        for (int i=0; i< buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();
        }
        for (int i : input){
            buckets[hash(i)].add(i);
        }
        for (List bucket : buckets){
            Collections.sort(bucket); //mergesort
        }

        int j = 0;
        for (int i=0; i<buckets.length; i++){
            for (int value : buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value){
        return value/(int) 10;
    }
}

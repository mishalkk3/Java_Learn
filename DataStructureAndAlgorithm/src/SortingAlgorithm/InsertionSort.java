package SortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        insertionSort(intArray);
        //recursiveInsertionSort(intArray,intArray.length);

        for (int i : intArray){
            System.out.println(i);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void insertionSort(int[] input) {
        for (int firstUnsortedIndex=1;firstUnsortedIndex<input.length;firstUnsortedIndex++){
            int temp = input[firstUnsortedIndex];
            int i;

            for(i=firstUnsortedIndex;(i>0) && (input[i-1]>temp);i--){
                input[i] = input[i-1];
            }
            input[i] = temp;
        }
    }




    public static void recursiveInsertionSort(int[] input, int numItems){
        if (numItems <2)
            return;
        recursiveInsertionSort(input,numItems-1);

        int temp = input[numItems -1];
        int i;

        for(i=numItems -1;(i>0) && (input[i-1]>temp);i--){
            input[i] = input[i-1];
        }
        input[i] = temp;
    }
}

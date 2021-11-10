public class HeapSort {
    public static void main(String[] args) {
        // 80 75 60 68 55 40 52 67
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);    // 2*2+1 = 5 LC And 2*2+2 = 6
        heap.insert(68);    // 3-1 / 2 = 1
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);
        heap.printHeap();
        System.out.println("---------------------------------------");
        heap.sort();
        heap.printHeap();
    }
}

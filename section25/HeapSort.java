public class HeapSort {
    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {//tc o n log n ---sc o 1
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insert(arr[i], "Max");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = bh.extractHead("Min");
        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

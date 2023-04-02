public class InsertionSort {

    public void insertionSort(int[] arr) {//tc o(n^2)---sc o(1)
        for (int i = 1; i < arr.length; i++) {
            int temp = i, j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class QuickSort {

    public static int partition(int[] arr, int start, int end) {//tc o(n)---sc o1
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public static void quickSort(int[] arr, int start, int end) {//tc o n logn --on 
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

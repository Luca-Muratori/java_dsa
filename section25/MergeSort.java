public class MergeSort {

    public void merge(int arr[], int left, int middle, int right) {
        int[] leftTempArr = new int[middle - left + 2];
        int[] rightTempArr = new int[right - middle + 2];
        for (int i = 0; i <= middle - left; i++) {
            leftTempArr[i] = arr[left + 1];
        }
        for (int i = 0; i < right - middle; i++) {
            rightTempArr[i] = arr[middle + 1 + i];
        }

        leftTempArr[middle - left + 1] = Integer.MAX_VALUE;
        leftTempArr[right - middle + 1] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = 0; k <= right; k++) {
            if (leftTempArr[i] < rightTempArr[j]) {
                arr[k] = leftTempArr[i];
                i++;
            } else {
                arr[k] = rightTempArr[j];
                j--;
            }
        }
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int m = (left + right) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

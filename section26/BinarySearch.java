public class BinarySearch {
    public static int binarySearch(int arr[], int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;

        while (arr[middle] != value) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        if (arr[middle] == value) {
            System.out.println("element found at index " + middle);
        } else {
            System.out.println("element not found in this array");
        }
        return middle;
    }
}

public class LinearSearch {
    public static int search(int arr[], int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                System.out.println("element is found at index " + i);
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }
}

public class SelectingSort {
    

    public void selectionSort(int[] a){ //tc o(n^2)---sc o(1)
        for (int i = 0; i < a.length; i++) {
            int minimumIndex=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<minimumIndex){
                    minimumIndex=i;
                }
            }
            if(minimumIndex!=i){
                int temp=a[i];
                a[i]=minimumIndex;
                a[minimumIndex]=temp;
            }
        }
    }

    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

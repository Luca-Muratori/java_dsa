class Main{
    public static void main(String[] args) {
        BubbleSort bs= new BubbleSort();
        SelectingSort ss=new SelectingSort();
        int arr[]={1,2,45,232,22};
        bs.bubbleSort(arr);
        bs.print(arr);
        ss.selectionSort(arr);
        ss.printArr(arr);
    }

}
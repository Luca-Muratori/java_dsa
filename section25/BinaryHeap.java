public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {// tc o(1)---sc o(n)
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("BH has been created");
    }

    // peek of heap=root of the binary heap
    public boolean isEmpty() {// tc o(1)---sc o(1)
        if (sizeOfTree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer peek() {// tc o(1)---sc o(1)
        if (isEmpty()) {
            System.out.println("bh is empty");
            return null;
        } else {
            return arr[1];
        }
    }

    public int sizeOfBH() {
        return sizeOfTree;
    }

    public void levelOrder() {// tc o(n)---sc o(1)
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println("\n");
    }

    public void heapifyBtnToTop(int index, String heapType) {// tc o(log n)---sc o(log n)
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }
        heapifyBtnToTop(parent, heapType);
    }

    public void insert(int value, String typeOfHeap) {// tc o logn ---sc o log n

        arr[sizeOfTree + 1] = value;
        sizeOfTree++;

        heapifyBtnToTop(sizeOfTree, typeOfHeap);
        System.out.println("inserted succesfully");
    }

    public void heapifyTopToBottom(int index, String heapType) {// tc o(logn)---sc o logn
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[index] > arr[left]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        } else if (heapType == "Min") {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[index] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHead(String heapType) {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    public void deleteAll() {
        arr = null;
        System.out.println("bh has been deleted");
    }

    
}

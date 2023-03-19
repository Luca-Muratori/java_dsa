public class QueueArr {
    int[] arr;
    int topOfQueue;
    int beginninOfQueue;

    public QueueArr(int size) {// time compl o(1) space compl O(N)
        this.arr = new int[size];
        this.beginninOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("QUEUE IS CREATED WITH SIZE " + size);
    }

    public boolean isFull() {// time compl O(1) space compl O(1)
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {// time compl O(1) space compl O(1)
        if (beginninOfQueue == arr.length - 1 || beginninOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    //insert element at the end of queue
    public void enQueue(int value) {//time compl O(1) space compl O(1)
        if (isFull()) {
            System.out.println("QUEUE IS FULL");
        } else if (isEmpty()) {
            beginninOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("VALUE (" + value + ") IS INSERTED AT INDEX " + topOfQueue);
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("VALUE (" + value + ") IS INSERTED AT INDEX " + topOfQueue);
        }
    }

    //remove the first element of the queue
    public int deQueue(){//O(1)  O(1)
         if(isEmpty()){
            System.out.println("THE QUEUE IS EMPTY");
            return -1;
        }else{
            int result=arr[beginninOfQueue];
            beginninOfQueue++;
            if(beginninOfQueue>topOfQueue){
                //the queue is empty
                beginninOfQueue=topOfQueue=-1;
            }
            return result;
        }
    }

    //return the first element of the queue
    public int peek(){//O(1)  O(1)
        if(!isEmpty()){
            System.out.println("THE BEGINNING OF THE QUEUE IS " + arr[beginninOfQueue]);
            return arr[beginninOfQueue];
        }else{
            System.out.println("THE QUEUE IS EMPTY");
            return -1;
        }
    }

    public void deleteQueue(){//O(1)  O(1)
        arr=null;
        System.out.println("QUEUE IS SUCCESSFULLY DELETED");
    }

}

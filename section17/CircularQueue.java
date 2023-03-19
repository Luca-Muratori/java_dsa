//CIRCULAR QUEUE 
//  with linear queue when we delete the first element we don't change the content of the first cell, and moving all the elemnt
//  one index less will take time complexity o(n), so we use circular queue to make the time complexity O(1)
public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginninOfQueue;
    int size;

    public CircularQueue(int size){// TC O(1)-- SC O(N)
        this.arr=new int[size];
        this.size=size;
        this.topOfQueue=this.beginninOfQueue=-1;
        System.out.println("CIRCULAR QUEUE SUCCESFULLY CREATED WITH SIZE "+size);
    }

    public boolean isEmpty(){// TC O(1)-- SC O(1)
        if(topOfQueue==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){// TC O(1)-- SC O(1)
        if(topOfQueue+1==beginninOfQueue){
            return true;
        }else if(beginninOfQueue==0 && topOfQueue+1==size){
            return true;
        }else{
            return false;
        }
    }
    
    public void enQueueu(int value){// TC O(1)-- SC O(1)
        if(isFull()){
            System.out.println("FULL");
        }else if(isEmpty()){
            beginninOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("value inserted");
        }else {
            if(topOfQueue+1==size){
                topOfQueue=0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("value added");
        }
    }

    public int deQueue(){// TC O(1) -- SC O(1)
        if(isEmpty()){
            return -1;
        }else{
            int result=arr[beginninOfQueue];
            arr[beginninOfQueue]=0;
            if(beginninOfQueue==topOfQueue){
                //it means that we have only one element
                beginninOfQueue=topOfQueue=-1;
            }else if(beginninOfQueue+1==size){
                //it means that the beginning of our queue points at the beginning of our array
                beginninOfQueue=0;
            }else{
                beginninOfQueue++;
            }
            return result;
        }
    }

    public int peek(){// TC O(1) -- SC O(1)
        if(!isEmpty()){
            System.out.println("first element = "+arr[beginninOfQueue]);
            return arr[beginninOfQueue];
        }else{
            return -1;
        }
    }

    public void delete(){// TC O(1) -- SC O(1)
        arr=null;
        System.out.println("queue deleted");
    }
}

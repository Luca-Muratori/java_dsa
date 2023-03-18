public class StackArr {
    //using array
    int[] arr;
    int topOfStack;
    public StackArr(int size){         //time complexity: O(1);
            this.arr=new int[size];     //space complexity:O(N), because we have to create n
            this.topOfStack=-1;         // contigious cell
            System.out.println("THE STACK IS CREATED WITH SIZE "+ size);
    }

    public boolean isEmpty(){                           //time complexity:O(1)
        if(topOfStack==-1){                             //space complexity:O(1), because we are not performing  
           // System.out.println("the stack is empty");    //operations that are space consuming  
            return true;         
        } else {
           // System.out.println("the stack is not empty");
            return false;
        }
    }

    public boolean isFull(){                             //time complexity:O(1)
        if(topOfStack==arr.length-1){                    //space complexity:O(1), because we are not performing
           // System.out.println("the stack is full");     //operations that are space consuming
            return true;
        } else {
           // System.out.println("the stack is not full");
            return false;
        }
    }

    public void push(int value){ //time complexity:O(1) space complexity:O(1)
        if(isFull()){
            System.out.println("stack is full");
        } else {
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("the value is successfully inserted");
        }
    }

    public int pop(){//time complexity:O(1) space complexity:O(1)
        if(isEmpty()){
            System.out.println("THE STACK IS EMPTY");
            return -1;
        }else {
            int topStack=arr[topOfStack];
            topOfStack--;
            System.out.println("removed ("+ topStack+ ") as last element");
            return topStack;
        }
    }

    public int peek(){//time complexity:O(1) space complexity:O(1)
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");
            return -1;
        } else {
            System.out.println("the element at the top is (" + arr[topOfStack] +")");
            return arr[topOfStack];
        }
    }

    public void deleteALl(){//time complexity:O(1) space complexity:O(1)
        arr=null;
        System.out.println("All the stack is deleted");
    }
}

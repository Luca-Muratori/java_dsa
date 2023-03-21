public class QueueLL {
    LinkedList list;

    public QueueLL(){ //tc O(1)---sc O(1)
        list = new LinkedList();
        System.out.println("QUEUELL IS CREATED");
    }

    public boolean isEmpty(){//tc O(1)---sc O(1)
        if(list.head==null){
            return true;
        } else {
            return false;
        }
    }

    //insert an element at the end of the queue
    public void enQueue(int value){//tc O(1)---sc O(1)
        list.insertInLL(value, list.size);
        System.out.println("Value succesfully inserted");
    }

    //remove the first element of the queue
    public int deQueue(){//tc O(1)---sc O(1)
        int value=-1;
        if(isEmpty()){
            System.out.println("the queue is empty");
        } else {
            value=list.head.value;
            list.deleteNode(0);
        }
        return value;
    }

    //return the first element of the queue
    public int peek(){//tc O(1)---sc O(1)
        if(!isEmpty()){
            int value=list.head.value;
            return value;
        }else{
            return -1;
        }
    }

    public void delete(){//tc O(1)---sc O(1)
        list.head=null;
        list.tail=null;
        System.out.println("queue succesfully deleted");
    }

}

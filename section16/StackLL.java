public class StackLL {
    LinkedList linkedList;   //in LL the  first node inserted will depart from the head, every time we had a new element
    //for example head->1 -----then we add another node -----head->2->1----then we add another node -
    //--head->3->2->1 
    //and the stack will be like this
    //|3|
    //|2|
    //|1|
    //head

    public StackLL(){
        linkedList=new LinkedList();
    }

    public void push(int value){ //time complexity:O(1) space complexity:O(1)
        linkedList.insertInLL(value, 0);
        System.out.println("inserted "+ value+ " in stack");
    }

    public boolean isEmpty(){ //time complexity:O(1) space complexity:O(1)
        if(linkedList.head==null){
            return true;
        }else {
            return false;
        }
    }

    public int pop(){ //time complexity:O(1) space complexity:O(1)
        int result=-1;
        if(isEmpty()){
            System.out.println("stack is EMPTY");
        }else {
            result=linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }

    public int peek(){ //time complexity:O(1) space complexity:O(1)
        if(isEmpty()){
            System.out.println("stack is EMPTY");
            return -1;
        }else {
            return linkedList.head.value;
        }
    }

    public void delete(){ //time complexity:O(1) space complexity:O(1)
        linkedList.head=null;
        System.out.println("STACK IS DELETED");
    }



}

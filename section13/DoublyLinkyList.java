public class DoublyLinkyList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode create(int nodeValue){
        head=new DoublyNode();
        DoublyNode newNode= new DoublyNode();
        newNode.value=nodeValue;
        newNode.next=null;
        newNode.prev=null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    public  void insert(int nodeValue, int location){
        DoublyNode newNode=new DoublyNode();
        newNode.value=nodeValue;
        if(head==null){
            create(nodeValue);
            return;
        }else if(location == 0){
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
        }else if(location>=size){
            newNode.next=null;
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }else {
            DoublyNode tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            newNode.next.prev=newNode;
        }
        size++;
    }
}

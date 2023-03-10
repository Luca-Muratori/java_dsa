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

    public void traverse(){
        if(head!=null){
            DoublyNode tempNode= head;
            for (int i = 0; i < size ; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }
        }else{
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }

    public void reverseTraverse(){
        if(head!=null){
            DoublyNode tempNode=tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("<--");
                }
                tempNode=tempNode.prev;
            }
        } else {
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }

    public boolean search(int nodeValue){
        if(head!=null){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value==nodeValue){
                    System.out.println("Node ("+tempNode.value+") found at location " + i);
                    return true;
                }
               tempNode=tempNode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

    public void delete(int location){
        if(head==null){
            System.out.println("dll does not exist");
            return;
        } else if(location==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }else{
                head=head.next;
                head.prev=null;
                size--;
            }
        } else if(location>=size){
            DoublyNode tempNode=tail.prev;
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }else{
                tempNode.next=null;
                tail=tempNode;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }
    }

    public void deleteAll(){
        DoublyNode tempNode=head;
        for (int i = 0; i < size; i++) {
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;
        System.out.println("the dll has been deleted");
    }
}

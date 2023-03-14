import java.util.*;
public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size=1;
    }

    public void insert(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void traverse(){
        Node tempNode=head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("-->");
            }
            tempNode=tempNode.next;
        }
        System.out.println();
    }

    public void deleteDuplicate(LinkedList ll){
        HashSet<Integer> hs= new HashSet<>();
        Node currentNode=ll.head;
        Node prev= null;
        while(currentNode !=null){
            int currentValue=currentNode.value;
            if(hs.contains(currentValue)){
                prev.next=currentNode.next;
                ll.size--;
            } else {
                hs.add(currentValue);
                prev=currentNode;
            }
            currentNode=currentNode.next;
        }
    }

    public Node returnNthToLast(LinkedList ll, int value){
        Node pointer1=ll.head;
        Node pointer2=ll.head;
        for (int i = 0; i < value; i++) {
            if(pointer1==null){
                return null;
            }
            pointer2=pointer2.next;
        }
        while(pointer2 != null) {
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return pointer1;
    }
}

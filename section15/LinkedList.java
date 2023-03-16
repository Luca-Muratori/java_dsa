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
        if(head==null){
            createLL(nodeValue);
            return;
        }
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

    public LinkedList partition(LinkedList ll, int x){
        Node currentNode=head;
        ll.tail=ll.head;
        while(currentNode!=null){
            Node next=currentNode.next;
            if(currentNode.value<x){
                currentNode.next=ll.head;
                ll.head=currentNode;
            }else{
                ll.tail.next=currentNode;
                ll.tail=currentNode;
            }
            currentNode=next;
        }
        ll.tail.next=null;
        return ll;
    }

    public LinkedList sumLists(LinkedList ll1, LinkedList ll2){
        Node currentNode1=ll1.head;
        Node currentNode2=ll2.head;
        int carry=0;
        LinkedList totalLL=new LinkedList();
        while (currentNode1!=null||currentNode2!=null) {
            int result=carry;
            if(currentNode1!=null){
                result+=currentNode1.value;
                currentNode1=currentNode1.next;
            }
            if(currentNode2!=null){
                result+=currentNode2.value;
                currentNode2=currentNode2.next;
            }
            totalLL.insert(result%10);
            carry=result/10;
        }
        return totalLL;
    }    


    public Node getKthNode(Node head, int k){
        Node currentNode=head;
        while (k>0 && currentNode!= null) {
            currentNode=currentNode.next;
            k--;
        }
        return currentNode;
    }

    public Node findIntersection(LinkedList ll1, LinkedList ll2){
        if(ll1.head==null || ll2.head==null){
            return null;
        }
        if(ll1.tail==ll2.tail){
            return null;
        };
        Node longer=new Node();
        Node shorter=new Node();
        if(ll1.size>ll2.size){
            longer=ll1.head;
            shorter=ll2.head;
        } else {
            longer=ll2.head;
            shorter=ll1.head;
        }
        longer=getKthNode(longer, Math.abs(ll1.size-ll2.size));
        while (shorter!=longer) {
            shorter=shorter.next;
            longer=longer.next;
        }
        return longer;
    }

    public void addSameNode(LinkedList ll1, LinkedList ll2, int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        ll1.tail.next=newNode;
        ll1.tail=newNode;
        ll2.tail.next=newNode;
        ll2.tail=newNode;

        
    }
}

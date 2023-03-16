class Main{

    public static void main(String[] args) {
        // LinkedList ll= new LinkedList();
        // ll.createLL(1);
        // ll.insert(3);
        // ll.insert(45);
        // ll.insert(26);
        // ll.insert(26);
        // ll.insert(26);
        // ll.insert(55);
        // ll.insert(87);
        // ll.insert(121);
        // ll.traverse();
        // ll.deleteDuplicate(ll);
        // ll.traverse();
        // ll.partition(ll, 44);
        // ll.traverse();  
        LinkedList ll1= new LinkedList();
        LinkedList ll2= new LinkedList();
        LinkedList sumLists= new LinkedList();
        ll1.insert(9);
        ll1.insert(9);
        ll1.insert(9);
        ll2.insert(9);
        ll2.insert(9);
        ll2.insert(9);
        ll1.traverse();
        ll2.traverse();
        LinkedList summy=sumLists.sumLists(ll1, ll2);
        summy.traverse();

       

      
    }
}
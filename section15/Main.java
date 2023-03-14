class Main{
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.createLL(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(4);
        ll.insert(5);
        ll.insert(5);
        ll.traverse();
        ll.deleteDuplicate(ll);
        ll.traverse();
      System.out.println(ll.returnNthToLast(ll, 2).value);  
    }
}
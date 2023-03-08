class Main{
    public static void main(String[] args) {
        CircularSinglyLL csll=new CircularSinglyLL();
        // csll.createCLL(1);
        // System.out.println(csll.head.value);
        // System.out.println(csll.head.next.value);
        csll.insertCSLL(1, 1);
        csll.insertCSLL(2, 2);
        csll.insertCSLL(3, 3);
        csll.insertCSLL(4, 4);
        csll.insertCSLL(5, 3);
        csll.search(1);
        // System.out.println(csll.tail.next.next.value);

        csll.traverseCSLL();
        csll.delete(8);
        csll.traverseCSLL();
        csll.deleteAll();
        csll.traverseCSLL();

    }
}
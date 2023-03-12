class Main{
    public static void main(String[] args) {
        CircularDLL cdll=new CircularDLL();
        cdll.create(1);
        System.out.println(cdll.head.value);
        cdll.insert(4,2);
        cdll.insert(1,3);
        cdll.insert(2,4);
        cdll.insert(3,5);
        cdll.traverse();
        cdll.reverseTraverse();
        cdll.search(8);
        cdll.search(2);
        cdll.delete(3);
        cdll.traverse();
        cdll.deleteAll();
        cdll.traverse();
    }
}
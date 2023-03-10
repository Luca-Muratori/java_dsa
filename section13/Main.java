public class Main{
    public static void main(String[] args) {
        DoublyLinkyList dll=new DoublyLinkyList();
        // dll.create(3);

        // System.out.println(dll.head.value);
        dll.insert(1, 0);
        dll.insert(2, 1);
        dll.insert(3, 2);
        dll.insert(4, 3);
        dll.insert(5, 2);
        dll.insert(7, 4);
        dll.traverse();
        dll.reverseTraverse();
        dll.search(6);
        dll.search(2);
        dll.delete(3);
        dll.traverse();
        dll.deleteAll();
        dll.traverse();
        System.out.println("finesded");

    }
}
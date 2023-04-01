class Main{
    public static void main(String[] args) {
        BinaryHeap bh=new BinaryHeap(5);
        bh.insert(10,"Max");
        bh.insert(5,"Max");
        bh.insert(15,"Max");
        bh.insert(1,"Max");
        bh.levelOrder();
    }
}
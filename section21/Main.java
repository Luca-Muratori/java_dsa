class Main{
    public static void main(String[] args) {
        AVL  newAVL= new AVL();
        newAVL.insert(5);
        newAVL.insert(5123);
        newAVL.insert(59);
        newAVL.insert(57);
        newAVL.insert(54);
        newAVL.insert(52);
        newAVL.insert(510);
        newAVL.levelOrder(newAVL.root);
        System.out.println();
    }
}
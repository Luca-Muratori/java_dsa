class Main{
    public static void main(String[] args) {
        BinaryTree binTree=new BinaryTree();
        binTree.insert(80);
        binTree.insert(60);
        binTree.insert(50);
        binTree.insert(70);
        binTree.insert(30);
        binTree.insert(40);
        binTree.insert(20);
        binTree.insert(10);
        binTree.preOrder(binTree.root); 
        System.out.println();
        binTree.inOrder(binTree.root); 
        System.out.println();
        binTree.postOrder(binTree.root); 
        System.out.println();
        System.out.println();
        binTree.search(binTree.root, 10);
        binTree.search(binTree.root, 1000);
        binTree.levelOrder();
        System.out.println();
        binTree.deleteNode(binTree.root, 40);
        binTree.levelOrder();

    }
}
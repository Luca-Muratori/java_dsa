
class Main {
    public static void main(String[] args) {
        // TreeNode drinks= new TreeNode("Drinks");
        // TreeNode hot= new TreeNode("Hot");
        // TreeNode cold= new TreeNode("Cold");

        // TreeNode tea= new TreeNode("tea");
        // TreeNode coffee= new TreeNode("coffee");
        // TreeNode wine= new TreeNode("wine");
        // // TreeNode beer= new TreeNode("beer");

        // // drinks.addChild(cold);
        // // drinks.addChild(hot);

        // // cold.addChild(beer);
        // // cold.addChild(wine);
        // // hot.addChild(tea);
        // // hot.addChild(coffee);
        // // System.out.println(drinks.print(0));

        // BinaryTreeLL binaryTree = new BinaryTreeLL();
        // BinaryNode N1 = new BinaryNode();
        // N1.value = "N1";
        // BinaryNode N2 = new BinaryNode();
        // N2.value = "N2";
        // BinaryNode N3 = new BinaryNode();
        // N3.value = "N3";
        // BinaryNode N4 = new BinaryNode();
        // N4.value = "N4";
        // BinaryNode N5 = new BinaryNode();
        // N5.value = "N5";
        // BinaryNode N6 = new BinaryNode();
        // N6.value = "N6";
        // BinaryNode N7 = new BinaryNode();
        // N7.value = "N7";
        // BinaryNode N8 = new BinaryNode();
        // N8.value = "N8";
        // BinaryNode N9 = new BinaryNode();
        // N9.value = "N9";

        // N1.left = N2;
        // N1.right = N3;
        // N2.left = N4;
        // N2.right = N5;
        // N3.left = N6;
        // N3.right = N7;
        // N4.left = N8;
        // N4.right = N9;
        // binaryTree.root = N1;
        // // by following the order of the preorder traversal, first left than right:
        // // N1-> N2-> N4-> N8-> N9-> N5-> N3-> N6-> N7

        // binaryTree.preOrder(binaryTree.root);
        // System.out.println("");
        // // binaryTree.inOrder(binaryTree.root);
        // // System.out.println("");
        // // binaryTree.postTraversal(binaryTree.root);
        // // System.out.println("");
        // // binaryTree.levelTraversal(binaryTree.root);
        // // System.out.println("");
        // // binaryTree.search("N3");

        // // binaryTree.insert("N10");
        // binaryTree.levelTraversal(binaryTree.root);
        // // binaryTree.preOrder(binaryTree.root);
        // System.out.println("");
        // BinaryNode result= binaryTree.getDeepest();
        // System.out.println(result.value);
        // binaryTree.levelTraversal(binaryTree.root);
        // binaryTree.deleteDeepestNode();
        // System.out.println(result.value);

        BinaryTreeArr newBinaryTreeArr=new BinaryTreeArr(6);
        newBinaryTreeArr.insert("n1");
        newBinaryTreeArr.insert("n2");
        newBinaryTreeArr.insert("n3");
        newBinaryTreeArr.insert("n4");
        newBinaryTreeArr.insert("n5");
        newBinaryTreeArr.insert("n6");
        //for the preorder we use 1, becuase is the value of the root node
        newBinaryTreeArr.preOrder(1);
        System.out.print("\n");
    }
}
public class BinaryTreeArr {
    // we want use the first cell, because it will be easier do math calculaiton
    String[] arr;
    int lastUsedIndex;

    public BinaryTreeArr(int size) {// tc o(1)---sc o(n)
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Tree is created");
    }

    public boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // insert a node
    public void insert(String value) {// tc o(1)---sc o(1)
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("value inserted");
        } else {
            System.out.println("binary tree is full");
        }
    }

    // traverse binary tree:4 options

    // -preorder traversal=first we start with the root node than we continue with
    // the left child nodes,
    // continue with the right child nodes of the last node that we visited fter all
    // the left child
    // and traverse all the right node, the when we reach the right child node of
    // the root we traverse the left child
    // and then we move throught the right ones
    // index=will be always equal to 1, for the root
    public void preOrder(int index) {// tc o(n)---sc o(n)
        if (index > lastUsedIndex) {
            // we don't have any value, so we close this function
            return;
        }
        System.out.print(arr[index] + " ");
        // in order to get the left children, we multiply the index with 2
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    // -inOrder traversal=we start from the left subtree, then the root then the
    // right subtree
    public void inOrder(int index) {// tc o(n)---sc o(n)
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.println(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    // -postOrder traversal= visit first left subtree, than right subtree, than root
    public void postOrder(int index) {// tc o(n)---sc o(n)
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.println(arr[index] + "");
    }

    // -levelOrder=we traverse the tree by each level
    public void levelOrder() {// tc o(n)---sc o(n)
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // search- we will use levelOrder traversal, return the index of the value
    public int search(String value) {// tc o(n)---sc o(1)
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (value == arr[i]) {
                System.out.println("value exist at the location " + i);
                return i;
            }
        }
        System.out.println("value does not exist");
        return -1;
    }

    // delete a node--we will use levelOrder traversal, 
    public void deleteNode(String value) {// tc o(n)---sc o(1)
        int location=search(value);
        if(location==-1){
            return;
        }else{
            //after the deletion we have
            // to modify the node with the deepest node value
            arr[location]=arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("the node is successfully deleted");
        }
    }

    //delete all the node
    public void deleteAll(){// tc o(1)---sc o(1)
        try {
            arr=null;
            System.out.println("bt succesfully deleted");
            
        } catch (Exception e) {
            System.out.println("error deleting the tree");
        }
    }
}

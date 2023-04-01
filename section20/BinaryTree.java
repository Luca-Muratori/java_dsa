import java.util.*;

public class BinaryTree {
    public BinaryNode root;

    public BinaryTree() {// tc o(1)---sc o(1)
        root = null;
    }

    // insert a node
    // by definition value less then the parent element will go on the left,
    // while higher value will go on the right
    private BinaryNode insertNode(BinaryNode currentNode, int value) {// tc o(1)---sc o(1)
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("value succesfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insertNode(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insertNode(currentNode.right, value);
            return currentNode;
        }
    }

    // main insert
    public void insert(int value) {// tc o(logN)---sc o(logN)
        root = insertNode(root, value);
    }

    // preOrder traversal
    // first root, then left then right subtree
    public void preOrder(BinaryNode node) {// tc o(n)---sc o(n)
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inoRDER TRAVERSAL
    // left-> root -> right
    public void inOrder(BinaryNode node) {// tc o(n)---sc o(n)
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // postOrder traversal
    // left-> right-> root
    public void postOrder(BinaryNode node) {// tc o(n)---sc o(n)
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // level Order traversal
    // we visit level by level
    // we will use LLinked List and queue
    public void levelOrder() {// tc o(n)---sc o(n)
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // search
    public BinaryNode search(BinaryNode node, int value) {// tc o(log n)---sc o(log n)
        if (node == null) {
            System.out.println("value not existing");
            return null;
        } else if (node.value == value) {
            System.out.println("value found in bt");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    // delete a node
    public BinaryNode deleteNode(BinaryNode root, int value) {// tc o(log n)---sc o(log n)
        if (root == null) {
            System.out.println("value not found");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    //delete all
    public void delteAll(){
        root=null;
        System.out.println("bin tree deleted");
    }
}

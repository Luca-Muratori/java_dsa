import java.util.*;

public class AVL {
    public BinaryNode root;

    AVL() {
        root = null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("value not found");
            return null;
        } else if (node.value == value) {
            System.out.println("value found");
            return node;
        } else if (node.value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }
}

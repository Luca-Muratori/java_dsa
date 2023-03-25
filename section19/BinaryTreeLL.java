import java.util.*;

public class BinaryTreeLL {
    public BinaryNode root;

    public BinaryTreeLL(){//tc o(1)--sc o(1)
        //at the beginning the root value will be null
        this.root=null;
    }

    //preorder traversal-we pass trought all the binary tree, from the root node, then left then right subtree
    public void preOrder(BinaryNode node){//tc o(n) -- sc o(n)
        if(node==null){
            //when we reach the deepest node, we stop the recursive call
            return;
        }
        System.out.print(node.value + "-->");
        preOrder(node.left);
        preOrder(node.right);
    }

    //we start from the more left subtree's left child node, then the 'root' node of this subtree, then the right node of the more left subtree
    public void inOrder(BinaryNode node){//tc o(n)--sc o(n)
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+"->");
        inOrder(node.right);
    }

    //we start from the most left substree, in which we check the left child of the left subtree node, than we move to the right substree root node, then we check the root
    public void postTraversal(BinaryNode node){//tc o(n)--sc o(n)
        if(node==null){
            return;
        }
        postTraversal(node.left);
        postTraversal(node.right);
        System.out.print(node.value+"->");
    }

    //level=number of ancestor from a given node to the root node ----level=0-> root(0 ancestor)--> level1->n2-n3(1 ancestor=root)
    //we start the traversal from the first level, from left to right, until we reach the last level, the last nodes
    public void levelTraversal(BinaryNode node){//tc o(n)--sc o(n)
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.print(presentNode.value+"->");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    //we use level traversal, because we use queue, that perform better than the stack, that we used in the other functions
    public void search(String value){//tc o(n)--sc o(n)
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.value==value){
                System.out.println("the value "+ value+ " is found in the tree");
                return;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
            System.out.println("value not found");
        }
    }

    //we use level traversal
    public void insert(String value){//tc o(n)--sc o(n)
        BinaryNode newNode=new BinaryNode();
        newNode.value=value;
        if(root==null){
            root=newNode;
            System.out.println("value inserted as root");
            return;
        }
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.left==null){
                presentNode.left=newNode;
                System.out.println("succesfully inserted");
                break;
            }else if(presentNode.right==null){
                presentNode.right=newNode;
                System.out.println("succesfully inserted");
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
}

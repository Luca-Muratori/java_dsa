import java.util.*;

public class Stack {
    private int capacity;
    public StackNode top;
    public StackNode bottom;
    public int size=0;

    public Stack(int capacity){
        this.capacity=capacity;
    }

    public boolean isFull(){
        return capacity==size;
    }

    public void join(StackNode above, StackNode below){
        if(below!=null){
            below.above=above;
        }
        if(above!=null){
            above.below=below;
        }
    }

    public boolean push(int value){
        if(size>=capacity){
            return false;
        }
        size++;
        StackNode node=new StackNode(value);
        if(size==1){
            bottom=node;
        }
        join(node, top);
        top=node;
        return true;
    }

    public int pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        int result=top.value;
        top=top.below;
        size--;
        return result;
    }

    public int removeBtn(){
        StackNode b=bottom;
        bottom=bottom.above;
        if(bottom!=null){
            bottom.below=null;
        }
        size--;
        return b.value;
    }

    

}

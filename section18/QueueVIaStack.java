import java.util.Stack;

public class QueueVIaStack {
    Stack<Integer> stackNewest, stackOldest;
    
    public QueueVIaStack(){
        stackNewest=new Stack<Integer>();
        stackOldest=new Stack<Integer>();
    }

    public int size(){
        return stackNewest.size()+stackNewest.size();
    }

    public void enQueue(int value){
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                int poppedOut=stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int deQueue(){
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }
}

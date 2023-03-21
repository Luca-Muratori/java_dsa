public class ThreeInOne {
    private int numberOfStack = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStack];
        sizes = new int[numberOfStack];
    }

    public boolean isFull(int stackNumber) {
        if (sizes[stackNumber] == stackCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(int stackNumber) {
        if (sizes[stackNumber] == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int indexOfTop(int stackNumber) {
        int offset = stackNumber * stackCapacity;
        int size = sizes[stackNumber];
        return offset + size - 1;
    }

    public void push(int stackNumber, int value) {
        if (isFull(stackNumber)) {
            System.out.println("stack is full");
        } else {
            sizes[stackNumber]++;
            values[indexOfTop(stackNumber)] = value;
        }
    }

    public int pop(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("the stack is empty");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNumber);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNumber]--;
            return value;
        }
    }

    public int peek(int stackNumber){
        if (isEmpty(stackNumber)) {
            System.out.println("the stack is empty");
            return -1;
        } else {
            int values = indexOfTop(stackNumber);
            return values;
        }
    }

}

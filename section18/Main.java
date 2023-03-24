public class Main {
    public static void main(String[] args) {
        // ThreeInOne threeInOne = new ThreeInOne(3);
        // threeInOne.push(0, 1);
        // threeInOne.push(0, 2);
        // threeInOne.push(1, 3);
        // threeInOne.push(1, 4);
        // threeInOne.push(2, 5);
        // threeInOne.push(2, 6);
        // System.out.println(threeInOne.peek(0));
        // System.out.println(threeInOne.pop(0));
        // System.out.println(threeInOne.peek(0));
        Stack newStack = new Stack(5);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println(newStack.pop());
    }
}
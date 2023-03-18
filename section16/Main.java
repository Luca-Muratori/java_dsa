//STACK= Linear data structure that follow the LIFO  principle, and contains only one pointer 
//      pointing at the topmost element of the stack

//using array:PRO(easy to implement) CONS(they have a fixed size)
//using LL :PRO(no fixed size) CONS(not easy to implement)
//when to
//           USE ------------------------------------------- AVOID 
//-when we need to implement                 |-random acces is not possible, we can only  
//      a LIFO  funcionality                 |   access the last element, if we want to 
//-chance of corruption is minimum           |   access inner elements we need first to pop
//      because the element are insterted    |   every element  
//      only at the top                      |-
//
class Main{
    public static void main(String[] args) {
        StackArr newStackArr=new StackArr(4);
        StackLL newStackLL=new StackLL();
        
       /*  newStackArr.push(1);
        newStackArr.push(2);
        newStackArr.push(3);
        newStackArr.push(4);
        newStackArr.push(5);//IS NOT INSERTED
        newStackArr.pop();
        newStackArr.peek();
        newStackArr.deleteALl();*/
        System.out.println(newStackLL.isEmpty());
        newStackLL.push(1);
        newStackLL.push(2);
        newStackLL.push(3);
        newStackLL.push(4);
        System.out.println(newStackLL.isEmpty());
        System.out.println(newStackLL.peek());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.peek());
        newStackLL.delete();



        
    }
}
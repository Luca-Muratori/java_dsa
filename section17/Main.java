//QUEUE = data structure that store items in a FIFO manner,
//like a queue when you want buy something
//end--------front
//50-40-30-20-10
//when we insert an element in it we insert it in the last
//WHY WE NEED IT? 
//-point sale system of a restaurant
//-printer queue
//-call center phone sistem
//IMPLEMENTATION
//  we can use array or linked list
//array-because the space complexity of the creation of queue is O(n), the implementation fo queue with arr is not space efficient
//LL- every function have o(1) for bot time and space complexity
//WHEN TO USE IT?
//use it when we need FIFO  funcionality
//data corruption is minimum, it's impossible to change a value inside a queue
//AVOID
//random access is not possible
class  Main{
    public static void main(String[] args) {
        // QueueArr queueArr= new QueueArr(5);
        // queueArr.enQueue(1);
        // queueArr.enQueue(2);
        // queueArr.enQueue(3);
        // queueArr.enQueue(4);
        // queueArr.enQueue(5);
        // queueArr.enQueue(6);
        // queueArr.peek(); 
        // System.out.println(queueArr.deQueue());  
        // queueArr.peek(); 
        // System.out.println(queueArr.deQueue()); 
        // queueArr.peek(); 
        // System.out.println(queueArr.deQueue()); 
        // queueArr.peek(); 
        // queueArr.deleteQueue();
        
        // CircularQueue circQueueArr= new CircularQueue(5);

        // circQueueArr.enQueueu(1);
        // circQueueArr.enQueueu(2);
        // circQueueArr.enQueueu(3);
        // circQueueArr.enQueueu(4);
        // circQueueArr.peek();
        // System.out.println(circQueueArr.deQueue()); 
        // circQueueArr.enQueueu(66);
        // circQueueArr.peek();
        // System.out.println(circQueueArr.deQueue()); 
        // circQueueArr.peek();
        // circQueueArr.delete();

        QueueLL qll=new QueueLL();
        qll.enQueue(10);
        qll.enQueue(20);
        qll.enQueue(30);
        qll.enQueue(40);
        qll.enQueue(50);
        System.out.println(qll.deQueue());
        
    }
}
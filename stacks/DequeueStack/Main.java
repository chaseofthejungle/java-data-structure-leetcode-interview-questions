public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        System.out.println("Value at Front of the Queue: " + myQueue.peek()); // 1

        System.out.println("Dequeued Value: " + myQueue.dequeue()); // 1
        System.out.println("Dequeued Value: " + myQueue.dequeue()); // 2

        myQueue.enqueue(5);

        System.out.println("Value at Front of the Queue: " + myQueue.peek()); // 3

        System.out.println("Dequeued Value: " + myQueue.dequeue()); // 3
        System.out.println("Dequeued Value: " + myQueue.dequeue()); // 4
        System.out.println("Dequeued Value: " + myQueue.dequeue()); // 5

        System.out.println("Is the Queue Empty? " + myQueue.isEmpty()); // true

        System.out.println("Dequeued Value from Empty Queue: " + myQueue.dequeue()); // null
    }
}

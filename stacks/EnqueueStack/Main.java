public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(12);
        myQueue.enqueue(30);
        myQueue.enqueue(28);

        System.out.println("Value at Front of the Queue: " + myQueue.peek()); // 1

        System.out.println("The Queue is Empty: " + myQueue.isEmpty()); // false
    }
}

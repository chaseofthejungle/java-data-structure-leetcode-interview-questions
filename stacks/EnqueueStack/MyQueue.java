import java.util.Stack;

public class MyQueue {
    private Stack<Integer> demoStack1;
    private Stack<Integer> demoStack2;

    public MyQueue() {
        demoStack1 = new Stack<>();
        demoStack2 = new Stack<>();
    }

    public void enqueue(int value) {
        while (!demoStack1.isEmpty()) {
            demoStack2.push(demoStack1.pop()); // moving elements between the stacks
        }

        demoStack1.push(value);

        while (!demoStack2.isEmpty()) {
            demoStack1.push(demoStack2.pop()); // moving elements between the stacks
        }
    }

    public int peek() {
        return demoStack1.peek();
    }

    public boolean isEmpty() {
        return demoStack1.isEmpty();
    }
}

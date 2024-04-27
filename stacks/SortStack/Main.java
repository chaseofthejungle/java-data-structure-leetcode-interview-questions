public class Main {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> extraStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tempValue = stack.pop(); // pop first element from stack

            while (!extraStack.isEmpty() && extraStack.peek() > tempValue) {
                stack.push(extraStack.pop());
            }

            extraStack.push(tempValue);
        }

        while (!extraStack.isEmpty()) {
            stack.push(extraStack.pop()); // completing the sort
        }
    }
    public static void main(String[] args) {
        Stack<Integer> demoStack = new Stack<>();
        demoStack.push(4);
        demoStack.push(1);
        demoStack.push(5);
        demoStack.push(2);
        demoStack.push(3);

        System.out.println("Prior to sorting:");
        demoStack.printStack(); // 3 2 5 1 4

        sortStack(demoStack);

        System.out.println("\nAfter sorting:"); // 1 2 3 4 5
        demoStack.printStack();
    }
}

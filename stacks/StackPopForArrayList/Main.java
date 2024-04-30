public class Main {
    public static void main(String[] args) {
        Stack demoStack = new Stack();
        demoStack.push(1);
        demoStack.push(2);
        demoStack.push(3);
        demoStack.push(4);

        System.out.println("\nStack nodes prior to pop():"); // 4 3 2 1
        demoStack.printStack();

        System.out.println("\n\nPopped node:"); // 4
        System.out.println(demoStack.pop());

        System.out.println("\nStack nodes after pop():"); // 3 2 1
        demoStack.printStack();
    }
}

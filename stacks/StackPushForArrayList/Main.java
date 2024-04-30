public class Main {
    public static void main(String[] args) {
        Stack demoStack = new Stack();

        demoStack.push(1);
        demoStack.push(2);
        demoStack.push(3);
        demoStack.push(4);

        demoStack.printStack(); // should return 4 3 2 1
    }
}

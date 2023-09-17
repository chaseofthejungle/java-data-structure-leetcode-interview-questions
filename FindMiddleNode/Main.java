public class Main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);
        newLinkedList.append(7);

        System.out.println("\n" + "Node Traversal: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7"); // hard-coded example
        System.out.println("The Middle Node is: " + newLinkedList.findMiddleNode().value); // will output to 4

        newLinkedList.append(8);

        System.out.println("\n" + "******************************");
        System.out.println("\n" + "Node Traversal: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8"); // hard-coded example
        System.out.println("The Middle Node is: " + newLinkedList.findMiddleNode().value); // will output to 5 (second middle value)
    }
}
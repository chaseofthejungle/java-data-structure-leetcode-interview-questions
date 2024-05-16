public class Main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);
        newLinkedList.append(7);

        newLinkedList.getTail().next = newLinkedList.getHead().next; // establishes a loop (tail connected to node #2)

        System.out.println("Linked List Includes a Loop: " + newLinkedList.hasLoop()); // this example should return true
    }
}

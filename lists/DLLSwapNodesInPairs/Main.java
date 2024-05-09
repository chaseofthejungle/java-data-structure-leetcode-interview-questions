public class Main {
    public static void main(String[] args) {
        DoublyLinkedList newDll = new DoublyLinkedList(1);
        newDll.append(2);
        newDll.append(3);
        newDll.append(4);

        System.out.println("Doubly Linked List prior to Swapping Pairs:");
        newDll.printList(); // 1 2 3 4

        newDll.swapPairs();

        System.out.println("\nDoubly Linked List after Swapping Pairs:");
        newDll.printList(); // 2 1 4 3
    }
}

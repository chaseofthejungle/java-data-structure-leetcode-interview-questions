public class Main {
    public static void main(String[] args) {
        DoublyLinkedList newDLL = new DoublyLinkedList(1);
        newDLL.append(2);
        newDLL.append(3);
        newDLL.append(4);
        newDLL.append(5);

        System.out.println("Doubly Linked List prior to Swapping First/Last Values:");
        newDLL.printList(); // 1, 2, 3, 4, 5

        newDLL.swapFirstLast();

        System.out.println("\nDoubly Linked List after Swapping First/Last Values:");
        newDLL.printList(); // 5, 2, 3, 4, 1
    }
}
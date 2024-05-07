public class Main {

    public static void main(String[] args) {
        DoublyLinkedList newDLL = new DoublyLinkedList(1);
        newDLL.append(2);
        newDLL.append(3);
        newDLL.append(4);
        newDLL.append(5);

        System.out.println("Doubly Linked List prior to Reversing:");
        newDLL.printList(); // 1 2 3 4 5

        newDLL.reverse();

        System.out.println("\nDoubly Linked List after Reversing:");
        newDLL.printList(); // 5 4 3 2 1
    }
}

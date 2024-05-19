public class Main {

    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);

        System.out.println("LinkedList prior to Reversing: ");
        newLinkedList.printList(); // 1 2 3 4 5 6

        newLinkedList.reverseBetween(1, 3);
        System.out.println("\nReversed Sublist for (1, 4): ");
        newLinkedList.printList(); // 1 4 3 2 5 6

        newLinkedList.reverseBetween(0, 5);
        System.out.println("\nReversed the Complete LinkedList: ");
        newLinkedList.printList(); // 6 5 4 3 2 1

        newLinkedList.reverseBetween(3, 3);
        System.out.println("\nReversed Sublist for a Length of 1 (3, 3): ");
        newLinkedList.printList(); // 6 5 2 3 4 1

        LinkedList emptyList = new LinkedList(0);
        emptyList.makeEmpty();
        emptyList.reverseBetween(0, 0);
        System.out.println("\nReversed an Empty LinkedList: ");
        emptyList.printList();
    }
}

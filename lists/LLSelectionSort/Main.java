public class Main {
    public static void main(String[] args) {
        LinkedList demoLinkedList = new LinkedList(7);
        demoLinkedList.append(5);
        demoLinkedList.append(3);
        demoLinkedList.append(4);
        demoLinkedList.append(1);
        demoLinkedList.append(2);
        demoLinkedList.append(6);

        System.out.println("Unsorted Linked List Values:"); // 7 5 3 4 1 2 6
        demoLinkedList.printList();

        demoLinkedList.selectionSort();

        System.out.println("\nSorted Linked List Values:"); // 1 2 3 4 5 6 7
        demoLinkedList.printList();
    }
}

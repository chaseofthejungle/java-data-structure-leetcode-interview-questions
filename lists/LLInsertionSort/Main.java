public class Main {

    public static void main(String[] args) {

        LinkedList demoLinkedList = new LinkedList(6);
        demoLinkedList.append(3);
        demoLinkedList.append(7);
        demoLinkedList.append(4);
        demoLinkedList.append(5);
        demoLinkedList.append(2);
        demoLinkedList.append(1);

        System.out.println("Unsorted Linked List:"); // 6 3 7 4 5 2 1
        demoLinkedList.printList();

        demoLinkedList.insertionSort();

        System.out.println("\nSorted Linked List:"); // 1 2 3 4 5 6 7
        demoLinkedList.printList();
    }
}

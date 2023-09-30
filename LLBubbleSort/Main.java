public class Main {

    public static void main(String[] args) {
        LinkedList demoLinkedList = new LinkedList(7);
        demoLinkedList.append(1);
        demoLinkedList.append(3);
        demoLinkedList.append(8);
        demoLinkedList.append(4);
        demoLinkedList.append(2);

        System.out.println("Unsorted LinkedList Values:"); // 7 1 3 8 4 2

        demoLinkedList.printList();
        demoLinkedList.bubbleSort();

        System.out.println("\nSorted LinkedList Values:"); // 1 2 3 4 7 8
        demoLinkedList.printList();
    }
}
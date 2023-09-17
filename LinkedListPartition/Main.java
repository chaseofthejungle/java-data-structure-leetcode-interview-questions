public class Main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(4);
        newLinkedList.append(7);
        newLinkedList.append(12);
        newLinkedList.append(3);
        newLinkedList.append(8);
        newLinkedList.append(5);

        System.out.println("\n" + "LinkedList before partitioning:");
        System.out.println("------------------------------");
        newLinkedList.printList(); // Output: 4 7 12 3 8 5

        newLinkedList.partitionList(8);

        System.out.println("\n\n" + "LinkedList after partitioning:");
        System.out.println("------------------------------");
        newLinkedList.printList(); // Output: 4 7 3 5 12 8
    }
}
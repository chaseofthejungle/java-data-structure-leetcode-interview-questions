public class Main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(1);

        newLinkedList.append(1);
        newLinkedList.append(2);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(3);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(5);
        newLinkedList.append(5);
        newLinkedList.append(5);

        newLinkedList.removeDuplicates();
        newLinkedList.printList(); // LinkedList will be: 1 2 3 4 5
    }
}

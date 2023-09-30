public class Main {
    public static void main(String[] args) {
        LinkedList demoLinkedList1 = new LinkedList(1);
        demoLinkedList1.append(2);
        demoLinkedList1.append(4);
        demoLinkedList1.append(6);
        demoLinkedList1.append(8);

        LinkedList demoLinkedList2 = new LinkedList(1);
        demoLinkedList2.append(3);
        demoLinkedList2.append(5);
        demoLinkedList2.append(7);

        demoLinkedList1.merge(demoLinkedList2);

        demoLinkedList1.printAll(); // head 1, tail 8, length 9. LL 1 1 2 3 4 5 6 7 8.
    }
}
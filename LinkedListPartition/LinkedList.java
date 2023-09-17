public class LinkedList {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node demoNode = new Node(value);
        head = demoNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print((tempNode.value) + "   ");
            tempNode = tempNode.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head is null.");
        } else {
            System.out.println("Head is " + head.value);
        }
        System.out.println("Length is " + length);
        System.out.println("\nLinked List: ");
        if (length == 0) {
            System.out.println("List is empty.");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node demoNode = new Node(value);
        if (head == null) {
            head = demoNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = demoNode;
        }
        length++;
    }

    public void partitionList(int x) {
        if (head == null) return; // LinkedList is empty, no need for further operation.

        // declare two dummy nodes for the new LinkedLists
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        // initialize pointer nodes for the new LinkedLists
        Node prevNode1 = dummy1;
        Node prevNode2 = dummy2;
        Node current = head; // iteration to begin at the head node

        // loop to iterate through the LinkedList
        while (current != null) {
            // nodes added to the new LinkedLists based on value compared to x
            if (current.value < x) {
                prevNode1.next = current;
                prevNode1 = current;
            } else {
                prevNode2.next = current;
                prevNode2 = current;
            }
            current = current.next; // continue iteration
        }

        prevNode2.next = null; // done creating second LinkedList
        prevNode1.next = dummy2.next; // connect the two LinkedLists
        head = dummy1.next; // head node of LinkedList is updated
    }
}
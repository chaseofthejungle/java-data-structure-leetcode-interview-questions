public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node demoNode = new Node(value);
        head = demoNode;
        tail = demoNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " ");
            tempNode = tempNode.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head is null.");
            System.out.println("Tail is null.");
        } else {
            System.out.println("Head is " + head.value);
            System.out.println("Tail is " + tail.value);
        }
        System.out.println("Length is: " + length);
        System.out.println("\nDoubly Linked List: ");
        if (length == 0) {
            System.out.println("List is empty.");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node demoNode = new Node(value);
        if (length == 0) {
            head = demoNode;
            tail = demoNode;
        } else {
            tail.next = demoNode;
            demoNode.prev = tail;
            tail = demoNode;
        }
        length++;
    }

    public boolean isPalindrome() {
        if (length <= 1) return true;

        Node forwardNode = head; // pointer for beginning of list
        Node backwardNode = tail; // pointer for ending of list

        // traversing list until the pointers meet up at the middle
        for (int i = 0; i < length / 2; i++) {
            if (forwardNode.value != backwardNode.value) return false;

            forwardNode = forwardNode.next; // moving pointer a step toward center of list...
            backwardNode = backwardNode.prev;
        }

        return true; // never reached false, so must be true
    }
}
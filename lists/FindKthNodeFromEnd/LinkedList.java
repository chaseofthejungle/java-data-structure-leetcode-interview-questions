public class LinkedList {

    private Node head;
    private Node tail;

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
        tail = demoNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head is null.");
            System.out.println("Tail is null.");
        } else {
            System.out.println("Head is " + head.value);
            System.out.println("Tail is " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node demoNode = new Node(value);
        if (head == null) {
            head = demoNode;
            tail = demoNode;
        } else {
            tail.next = demoNode;
            tail = demoNode;
        }
    }

    public Node findKthFromEnd(int k) {
        Node slowPointer = head;
        Node fastPointer = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fastPointer == null) { return null; } // check if k is out of bounds
            fastPointer = fastPointer.next;
        }

        while (fastPointer != null) {
            slowPointer = slowPointer.next; // Move pointer to the next node
            fastPointer = fastPointer.next; // Move pointer to the next node
        }

        return slowPointer; // Returns kth node pointed to from end of LinkedList
    }
}


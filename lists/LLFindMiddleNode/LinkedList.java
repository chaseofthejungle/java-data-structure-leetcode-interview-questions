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
        System.out.println("\nLinked List: ");
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

    public Node findMiddleNode() {
        Node slowPointer = head; // Slow pointer set to head of the linkedlist
        Node fastPointer = head; // Fast pointer set to head of the linkedlist

        // Logic to traverse the linked list with both pointers
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next; // Traversing one node at a time
            fastPointer = fastPointer.next.next; // Traversing two nodes at a time
        }

        return slowPointer; // the middle of the linkedlist
    }
}

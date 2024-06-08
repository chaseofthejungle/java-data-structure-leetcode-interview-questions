public class LinkedList {
    private Node head;
    private Node tail;
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
            System.out.println(tempNode.value);
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
        System.out.println("Length is " + length);
        System.out.println("\nLinked List:");
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
            tail = demoNode;
        }
        length++;
    }

    public boolean hasLoop() {
        Node slowPointer = head; // Slow pointer set to head of the LinkedList
        Node fastPointer = head; // Fast pointer set to head of the LinkedList

        // Logic to traverse the linked list with both pointers
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next; // Traversing one node at a time
            fastPointer = fastPointer.next.next; // Traversing two nodes at a time

            if (slowPointer == fastPointer) { // If slowPointer catches up with fastPointer...
                return true; // ... there is a loop in the LinkedList.
            }
        }

        return false; // Traversal completed, no loop detected in the LinkedList.
    }
}


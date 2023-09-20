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
        System.out.println("Length is " + length);
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

    public void append (int value) {
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

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node tempNode = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.next;
            }
        } else {
            tempNode = tail;
            for (int i = length - 1; i > index; i--) {
                tempNode = tempNode.prev;
            }
        }
        return tempNode;
    }

    public void reverse() {
        Node currentNode = head;
        Node tempNode = null;

        while (currentNode != null) {
            // replace the current node's previous and next pointers
            tempNode = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = tempNode;

            currentNode = currentNode.prev; // continue to the next node
        }

        // replace the head and tail pointers with each other
        tempNode = head;
        head = tail;
        tail = tempNode;
    }
}
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
            System.out.print((tempNode.value + " "));
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
        if (length == 0) {
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

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) return; // empty LinkedList, so no need to continue.

        Node dummyNode = new Node(0);
        dummyNode.next = head; // dummyNode before the head for edge case testing.
        Node prevNode = dummyNode; // for the node in front of the first node in sublist (currentNode).

        for (int i = 0; i < startIndex; i++) {
            prevNode = prevNode.next;
        }

        Node currentNode = prevNode.next;

        for (int i = 0; i < endIndex - startIndex; i++) { // reversing section from start to finish.
            Node nodeToMove = currentNode.next; // moving this node to start of sublist.
            currentNode.next = nodeToMove.next; // preparing to move node from its position.
            nodeToMove.next = prevNode.next; // nodeToMove will be at the front of the sublist.
            prevNode.next = nodeToMove; // nodeToMove will go to start of sublist.
        }

        head = dummyNode.next; // in case the node at the beginning was part of the sublist.
    }
}
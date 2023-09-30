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

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print((tempNode.value) + " ");
            tempNode = tempNode.next;
        }
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

    public void insertionSort() {
        if (length < 2) {
            return; // no need to sort further
        }

        Node sortedListHeadNode = head;
        Node unsortedListHeadNode = head.next;
        sortedListHeadNode.next = null;

        while (unsortedListHeadNode != null) {
            Node currentNode = unsortedListHeadNode;
            unsortedListHeadNode = unsortedListHeadNode.next;

            if (currentNode.value < sortedListHeadNode.value) {
                currentNode.next = sortedListHeadNode;
                sortedListHeadNode = currentNode;
            } else {
                Node searchPointer = sortedListHeadNode;
                while (searchPointer.next != null && currentNode.value > searchPointer.next.value) {
                    searchPointer = searchPointer.next;
                }
                currentNode.next = searchPointer.next;
                searchPointer.next = currentNode;
            }
        }

        head = sortedListHeadNode;
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tail = tempNode;
    }
}
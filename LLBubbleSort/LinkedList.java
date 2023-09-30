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

    void bubbleSort() {
        if (this.length < 2) return;

        Node sortedUntilNode = null;
        while (sortedUntilNode != this.head.next) {
            Node currentNode = this.head;
            while (currentNode.next != sortedUntilNode) {
                Node nextNode = currentNode.next;
                if (currentNode.value > nextNode.value) {
                    int tempNode = currentNode.value;
                    currentNode.value = nextNode.value;
                    nextNode.value = tempNode;
                }
                currentNode = currentNode.next;
            }
            sortedUntilNode = currentNode;
        }
    }
}
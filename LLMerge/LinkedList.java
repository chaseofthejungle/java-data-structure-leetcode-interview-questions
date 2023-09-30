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

    public void printAll() {
        if (length == 0) {
            System.out.println("Head is null.");
            System.out.println("Tail is null.");
        } else {
            System.out.println("Head value is: " + head.value);
            System.out.println("Tail value is: " + tail.value);
        }
        System.out.println("Length is: " + length);
        System.out.print("\nLinkedList values are: ");
        if (length == 0) {
            System.out.println("List is empty.");
        } else {
            printList();
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

    public void merge(LinkedList otherLinkedList) {
        Node otherHeadNode = otherLinkedList.getHead();
        Node dummyNode = new Node(0); // node to head the merged LL
        Node currentNode = dummyNode; // track the last node in merged LL

        while (head != null && otherHeadNode != null) {
            if (head.value < otherHeadNode.value) {
                currentNode.next = head;
                head = head.next;
            } else {
                currentNode.next = otherHeadNode;
                otherHeadNode = otherHeadNode.next;
            }
            currentNode = currentNode.next; // current now last node in merged LL
        }

        if (head != null) {
            currentNode.next = head;
        } else {
            currentNode.next = otherHeadNode;
            tail = otherLinkedList.getTail();
        }

        head = dummyNode.next;
        length += otherLinkedList.getLength(); // now length of merged LL
    }
}
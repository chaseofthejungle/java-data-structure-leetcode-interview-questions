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
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        StringBuilder outputStr = new StringBuilder();
        Node tempNode = head;

        while (tempNode != null) {
            outputStr.append(tempNode.value);
            if (tempNode.next != null) {
                outputStr.append(" <-> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println(outputStr.toString());
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        length++;
    }

    public void swapPairs() {
        Node dummyNode = new Node(0); // placeholder Node is used to make swapping process simpler

        dummyNode.next = head; // placeholder Node linked to the beginning of the DLL
        Node prevNode = dummyNode; // store Node before the pair is swapped

        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;

            prevNode.next = secondNode; // skip the first Node
            firstNode.next = secondNode.next; // prevent losing remainder of list by connecting Node 1 to node after Node 2
            secondNode.next = firstNode; // swap is completed
            secondNode.prev = prevNode;
            firstNode.prev = secondNode;

            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next; // moving after the current pair of Nodes
            prevNode = firstNode; // moving on to next pair of Nodes
        }

        head = dummyNode.next; // swapping is done, so update head to start after 'fake' Node

        if (head != null) head.prev = null; // assure at beginning of list
    }
}
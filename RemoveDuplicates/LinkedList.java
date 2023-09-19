import java.util.HashSet;
import java.util.Set;

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
            System.out.print((tempNode.value) + " ");
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
        System.out.println("\nLinked List: ");
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

    public void removeDuplicates() {
        Node current = head; // beginning of the LinkedList

        while (current != null) { // iterate until the end of the LinkedList
            Node nodeInProgress = current;

            while (nodeInProgress.next != null) {
                if (nodeInProgress.next.value == current.value) { // check if Node is duplicate value
                    nodeInProgress.next = nodeInProgress.next.next; // if so, remove it from LinkedList
                    length -= 1;
                } else {
                    nodeInProgress = nodeInProgress.next;
                }
            }

            current = current.next;
        }
    }
}
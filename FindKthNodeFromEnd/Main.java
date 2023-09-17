public class Main {

    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);

        int k = 4;
        int result = newLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // returns a value of 3 in this example
    }
}
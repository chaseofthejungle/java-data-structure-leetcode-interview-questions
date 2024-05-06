public class Main {
    public static void main(String[] args) {
        DoublyLinkedList newDLL1 = new DoublyLinkedList(1);
        newDLL1.append(2);
        newDLL1.append(3);
        newDLL1.append(4);
        newDLL1.append(3);
        newDLL1.append(2);
        newDLL1.append(1);

        System.out.println("Doubly Linked List #1 is a Palindrome: ");
        System.out.println(newDLL1.isPalindrome()); // true, because 1 2 3 4 3 2 1

        DoublyLinkedList newDLL2 = new DoublyLinkedList(1);
        newDLL2.append(2);
        newDLL2.append(3);
        newDLL2.append(4);

        System.out.println("\nDoubly Linked List #2 is a Palindrome: ");
        System.out.println(newDLL2.isPalindrome() ); // false, because 1 2 3 4
    }
}

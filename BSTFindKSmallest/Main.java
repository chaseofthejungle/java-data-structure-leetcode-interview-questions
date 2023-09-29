public class Main {
    public static void main(String[] args) {
        BinarySearchTree demoTree = new BinarySearchTree();

        demoTree.insert(10);
        demoTree.insert(4);
        demoTree.insert(6);
        demoTree.insert(0);
        demoTree.insert(5);
        demoTree.insert(3);
        demoTree.insert(7);

        System.out.println(demoTree.kthSmallest(1));  // prints 0
        System.out.println(demoTree.kthSmallest(4));  // prints 5
        System.out.println(demoTree.kthSmallest(7));  // prints 10
    }
}
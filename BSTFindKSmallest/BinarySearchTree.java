import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node tempNode = root;
        while (true) {
            if (newNode.value == tempNode.value) return false;
            if (newNode.value < tempNode.value) {
                if (tempNode.left == null) {
                    tempNode.left = newNode;
                    return true;
                }
                tempNode = tempNode.left;
            } else {
                if (tempNode.right == null) {
                    tempNode.right = newNode;
                    return true;
                }
                tempNode = tempNode.right;
            }
        }
    }

    public Integer kthSmallest(int k) {
        Stack<Node> demoStack = new Stack<>(); // will track nodes
        Node demoNode = this.root;

        while (!demoStack.isEmpty() || demoNode != null) {
            while (demoNode != null) {
                demoStack.push(demoNode);
                demoNode = demoNode.left; // traversing to the node and pushing nodes to stack
            }

            demoNode = demoStack.pop(); // no child nodes left, so pop from stack
            k -= 1;

            if (k == 0) {
                return demoNode.value; // the current node value
            }

            demoNode = demoNode.right; // traversing right since node finished processing
        }

        return null; // if less than k nodes remaining
    }
}
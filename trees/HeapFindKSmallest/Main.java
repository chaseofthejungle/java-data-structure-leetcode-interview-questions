public class Main {
    public static int findKthSmallest(int[] values, int k) {
        Heap maxHeap = new Heap();

        for (int value: values) {
            maxHeap.insert(value);
            if (maxHeap.getHeap().size() > k) {
                maxHeap.remove();
            }
        }

        return maxHeap.remove();
    }

    public static void main(String[] args) {
        // Test Case #1
        int[] values1 = {9, 14, 7, 5, 0, 12};
        int k1 = 2;
        System.out.println("Test Case #1");
        System.out.println("--------------------");
        System.out.println("Expected Output is: 5");
        System.out.println("Actual Output is: " + findKthSmallest(values1, k1));
        System.out.println();

        // Test Case #2
        int[] values2 = {1, 2, 3, 4, 5, 6, 7};
        int k2 = 4;
        System.out.println("Test Case #2");
        System.out.println("--------------------");
        System.out.println("Expected Output is: 4");
        System.out.println("Actual Output is: " + findKthSmallest(values2, k2));
        System.out.println();

        // Test Case #3
        int[] values3 = {7, 6, 5, 4, 3, 2, 1};
        int k3 = 6;
        System.out.println("Test Case #3");
        System.out.println("--------------------");
        System.out.println("Expected Output is: 6");
        System.out.println("Actual Output is: " + findKthSmallest(values3, k3));
    }
}

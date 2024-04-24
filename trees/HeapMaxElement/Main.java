import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> streamMax(int[] values) {
        Heap maxHeap = new Heap();
        List<Integer> maxStream = new ArrayList<>();

        for (int value: values) {
            maxHeap.insert(value);
            maxStream.add(maxHeap.getHeap().get(0));
        }

        return maxStream;
    }

    public static void main(String[] args) {
        // Test Case #1
        int[] values1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Test Case #1:");
        System.out.println("Input: [1, 2, 3, 4, 5, 6]");
        System.out.println("Expected Output is: [1, 2, 3, 4, 5, 6]");
        System.out.println("Actual Output is: " + streamMax(values1));
        System.out.println();

        // Test Case #2
        int[] values2 = {8, 4, 11, 2, 17, 6};
        System.out.println("Test Case #2:");
        System.out.println("Input: [8, 4, 11, 2, 17, 6]");
        System.out.println("Expected Output is: [8, 8, 11, 11, 17, 17]");
        System.out.println("Actual Output is: " + streamMax(values2));
        System.out.println();

        // Test Case #3
        int[] values3 = {15, 3, 7, 12, 16};
        System.out.println("Test Case #3:");
        System.out.println("Input: [15, 3, 7, 12, 16]");
        System.out.println("Expected Output is: [15, 15, 15, 15, 16]");
        System.out.println("Actual Output is: " + streamMax(values3));
        System.out.println();
    }
}

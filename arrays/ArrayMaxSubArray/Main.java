import java.util.Arrays;

public class Main {
    public static int maxSubArray(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int maxContiguousSum = values[0];
        int currentSum = values[0];

        for (int i = 1; i < values.length; i++) {
            currentSum = Math.max(values[i], currentSum + values[i]);
            maxContiguousSum = Math.max(maxContiguousSum, currentSum);
        }

        return maxContiguousSum;
    }

    public static void main(String[] args) {
        int[] input1 = {-3, 3, 1, 6, -6, 4, 4, 2, 1, 12};
        int result1 = maxSubArray(input1);
        System.out.println("Array #1: " + Arrays.toString(input1) + "\nResult: " + result1); // 27

        int[] input2 = {1, 2, -3, 4, -5, 6, 7};
        int result2 = maxSubArray(input2);
        System.out.println("Array #2: " + Arrays.toString(input2) + "\nResult: " + result2); // 13

        int[] input3 = {1, 2, 3, 4, 5, 6, 7};
        int result3 = maxSubArray(input3);
        System.out.println("Array #3: " + Arrays.toString(input3) + "\nResult: " + result3); // 28
    }
}

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] subArraySum(int[] values, int target) {
        Map<Integer, Integer> sumIndex = new HashMap<>(); // need to hold sum and index
        sumIndex.put(0, -1);
        int currentSum = 0; // haven't added any values yet

        for (int i = 0; i < values.length; i++) {
            currentSum += values[i];
            if (sumIndex.containsKey(currentSum - target)) {
                return new int[]{sumIndex.get(currentSum - target) + 1, i};
            }
            sumIndex.put(currentSum, i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int target1 = 6;
        int[] result1 = subArraySum(values1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [0, 2]

        int[] values2 = {1, -2, 3, 4, -5};
        int target2 = 6;
        int[] result2 = subArraySum(values2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [0, 3]

        int[] values3 = {4, 5, 6, 5, 4};
        int target3 = 11;
        int[] result3 = subArraySum(values3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // [1, 2]

        int[] values4 = {};
        int target4 = 0;
        int[] result4 = subArraySum(values4, target4);
        System.out.println("[]"); // []
    }
}

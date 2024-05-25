import java.util.*;

public class Main {
    public static int[] twoSum(int[] values, int target) {
        Map<Integer, Integer> valueMap = new HashMap<>(); // will contain values and indices

        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            int complement = target - value;

            if (valueMap.containsKey(complement)) {
                return new int[]{valueMap.get(complement), i};
            }
            valueMap.put(value, i);
        }

        return new int[]{}; // if no pair of values found
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 1, 8}, 3))); // [0, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{1, 7, 4}, 8))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2}, 5))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{0, 1, 2, 3, 4}, 12))); // []
        System.out.println(Arrays.toString(twoSum(new int[]{0, 1, 2, 3, 4}, 6))); // [2, 4]
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 5))); // [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0))); // []
    }
}

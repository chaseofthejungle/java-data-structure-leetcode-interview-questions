import java.util.*;

public class Main {
    public static List<int[]> findPairs(int[] array1, int[] array2, int target) {
        Set<Integer> demoSet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int value: array1) {
            demoSet.add(value);
        }

        for (int value: array2) {
            int complement = target - value;
            if (demoSet.contains(complement)) {
                pairs.add(new int[]{complement, value});
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};
        int target = 7;

        List<int[]> pairs = findPairs(array1, array2, target);
        for (int[] pair: pairs) {
            System.out.println(Arrays.toString(pair)); // [2, 5], [1, 6], [0, 7]
        }
    }
}

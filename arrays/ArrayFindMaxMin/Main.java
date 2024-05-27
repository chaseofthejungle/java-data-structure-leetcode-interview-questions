import java.util.Arrays;

public class Main {
    public static int[] findMaxMin(int[] valueList) {
        int maxValue = valueList[0];
        int minValue = valueList[0];
        for (int value : valueList) {
            if (value > maxValue) {
                maxValue = value;
            } else if (value < minValue) {
                minValue = value;
            }
        }
        return new int[] { maxValue, minValue };
    }

    public static void main(String[] args) {
        int[] valueList1 = {8, 1, 3, 7, 2};
        int[] result1 = findMaxMin(valueList1);
        System.out.println("Array #1 Maximum and Minimum Values: " + Arrays.toString(result1)); // [8, 1]

        int[] valueList2 = {0, 0, 0, 0, 0};
        int[] result2 = findMaxMin(valueList2);
        System.out.println("Array #2 Maximum and Minimum Values: " + Arrays.toString(result2)); // [0, 0]

        int[] valueList3 = {-5, -4, -3, -2, -1};
        int[] result3 = findMaxMin(valueList3);
        System.out.println("Array #3 Maximum and Minimum Values: " + Arrays.toString(result3)); // [-1, -5]
    }
}

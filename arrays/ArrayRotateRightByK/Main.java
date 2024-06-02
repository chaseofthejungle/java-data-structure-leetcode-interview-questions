import java.util.Arrays;

public class Main {
    public static void rotate(int[] values, int k) {
        k = k % values.length;

        // 1) Reverse the beginning.
        for (int start = 0, end = values.length - k - 1; start < end; start++, end--) {
            int tempValue = values[start];
            values[start] = values[end];
            values[end] = tempValue;
        }

        // 2) Reverse the next part.
        for (int start = values.length - k, end = values.length - 1; start < end; start++, end--) {
            int tempValue = values[start];
            values[start] = values[end];
            values[end] = tempValue;
        }

        // 3) Reverse the entire array.
        for (int start = 0, end = values.length - 1; start < end; start++, end--) {
            int tempValue = values[start];
            values[start] = values[end];
            values[end] = tempValue;
        }
    }

    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 2;
        rotate(values1, k1);
        System.out.println("Rotated Array #1: " + Arrays.toString(values1));  // [6, 7, 1, 2, 3, 4, 5]

        int[] values2 = {3, 12};
        int k2 = 5;
        rotate(values2, k2);
        System.out.println("Rotated Array #2: " + Arrays.toString(values2));  // [12, 3]

        int[] values3 = {-1};
        int k3 = 0;
        rotate(values3, k3);
        System.out.println("Rotated Array #4: " + Arrays.toString(values3));  // [-1]
    }
}

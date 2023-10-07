import java.util.Arrays;

public class Main {
    public static int removeDuplicates(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int writePointer = 1;

        for (int readPointer = 1; readPointer < values.length; readPointer++) {
            if (values[readPointer] != values[readPointer - 1]) {
                values[writePointer] = values[readPointer];
                writePointer++;
            }
        }

        return writePointer;
    }

    public static void main(String[] args) {
        int[] values1 = {0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4};
        int newLength1 = removeDuplicates(values1);
        System.out.println("Array #1 New Length: " + newLength1); // 5
        System.out.println("Unique Values: " + Arrays.toString(Arrays.copyOfRange(values1, 0, newLength1))); // [0, 1, 2, 3, 4]

        int[] values2 = {1, -1, 2, 2, 5, -4};
        int newLength2 = removeDuplicates(values2);
        System.out.println("Array #2 New Length: " + newLength2); // 5
        System.out.println("Unique Values: " + Arrays.toString(Arrays.copyOfRange(values2, 0, newLength2))); // [1, -1, 2, 5, -4]

        int[] values3 = {0, 0, 0, 0, 0, 0, 0};
        int newLength3 = removeDuplicates(values3);
        System.out.println("Array #3 New Length: " + newLength3); // 1
        System.out.println("Unique Values: " + Arrays.toString(Arrays.copyOfRange(values3, 0, newLength3))); // [0]

        int[] values4 = {};
        int newLength4 = removeDuplicates(values4);
        System.out.println("Array #4 New Length: " + newLength4); // 0
        System.out.println("Unique Values: " + Arrays.toString(Arrays.copyOfRange(values4, 0, newLength4))); // []
    }
}
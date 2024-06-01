import java.util.Arrays;

public class Main {
    public static int removeElement(int[] values, int valToRemove) {
        int i = 0;
        for (int j = 0; j < values.length; j++) {
            if (values[j] != valToRemove) {
                values[i] = values[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] values1 = {-5, 4, 1, -3, 2, 17, 89};
        int targetVal1 = 2;
        int newLength1 = removeElement(values1, targetVal1);
        System.out.println("\nLength of Modified Array: " + newLength1); // 6

        int[] values2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetVal2 = 3;
        int newLength2 = removeElement(values2, targetVal2);
        System.out.println("\nLength of Modified Array: " + newLength2); // 8

        int[] values3 = {};
        int targetVal3 = 1;
        int newLength3 = removeElement(values3, targetVal3);
        System.out.println("\nLength of Modified Array: " + newLength3); // 0

        int[] values4 = {-5, -4, -3, -2, -1};
        int targetVal4 = -1;
        int newLength4 = removeElement(values4, targetVal4);
        System.out.println("\nLength of Modified Array: " + newLength4); // 4

        int[] values5 = {3, 3, 3, 3, 3, 3, 3, 3};
        int targetVal5 = 3;
        int newLength5 = removeElement(values5, targetVal5);
        System.out.println("\nLength of Modified Array: " + newLength5); // 0
    }
}

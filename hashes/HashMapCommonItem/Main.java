import java.util.HashMap;

public class Main {
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> demoHashMap = new HashMap<>();

        for (int i: array1) {
            demoHashMap.put(i, true);
        }

        for (int j: array2) {
            if (demoHashMap.get(j) != null) { return true; }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {2, 4, 3};
        int[] array2 = {6, 0, 4};

        System.out.println(itemInCommon(array1, array2)); // true

        int[] array3 = {1, 2, 4};
        int[] array4 = {7, 3, 12};

        System.out.println(itemInCommon(array3, array4)); // false
    }
}

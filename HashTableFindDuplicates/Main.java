import java.util.*;

public class Main {
    public static ArrayList<Integer> findDuplicates(int[] values) {
        Map<Integer, Integer> valueCounts = new HashMap<>(); // store int value occurrences

        for (int value: values) {
            valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
        }

        ArrayList<Integer> duplicateValues = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: valueCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateValues.add(entry.getKey());
            }
        }

        return duplicateValues;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 3, 4, 17, 12};
        List<Integer> duplicates = findDuplicates(values);
        System.out.println(duplicates); // [3, 4]
    }
}
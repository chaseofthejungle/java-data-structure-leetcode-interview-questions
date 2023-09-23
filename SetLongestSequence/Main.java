import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int longestConsecSequence(int[] values) {
        Set<Integer> valuesSet = new HashSet<>();
        for (int value: values) {
            valuesSet.add(value);
        }

        int longestStreak = 0;

        for (int value: valuesSet) {
            if (!valuesSet.contains(value - 1)) {
                int currentNum = value;
                int currentStreak = 1;

                while (valuesSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] values = {1, 17, 0, 3, 90, 2};
        int longest = longestConsecSequence(values);
        System.out.println(longest);  // 4
    }
}
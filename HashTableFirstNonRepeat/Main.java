import java.util.*;

public class Main {
    public static Character firstNonRepeatingChar(String str) {
        Map<Character,Integer> charCounts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("sample")); // s
        System.out.println(firstNonRepeatingChar("aardvark")); // d
        System.out.println(firstNonRepeatingChar("aabbccddeeffg")); // g
        System.out.println(firstNonRepeatingChar("aabbccddeeffgg")); // null
    }
}

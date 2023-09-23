import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean hasUniqueChars(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char c: str.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }

            charSet.add(c);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("lazy fox.")); // true
        System.out.println(hasUniqueChars("")); // true
        System.out.println(hasUniqueChars("abcdce")); // false
        System.out.println(hasUniqueChars("555-1234")); // false
        System.out.println(hasUniqueChars("0123456789")); // true
    }
}
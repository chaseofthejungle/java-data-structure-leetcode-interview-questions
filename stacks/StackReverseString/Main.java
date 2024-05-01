public class Main {
    public static String reverseString(String string) {
        Stack<Character> demoStack = new Stack<>(); // will hold string characters
        String reversedStr = "";

        for (char c : string.toCharArray()) {
            demoStack.push(c);
        }

        while (!demoStack.isEmpty()) {
            reversedStr += demoStack.pop(); // adding removed characters to reversed message
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        String demoString = "thing";
        String reversedStr = reverseString(demoString);
        System.out.println(reversedStr); // gniht
    }
}

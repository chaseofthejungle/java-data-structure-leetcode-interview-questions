public class Main {
    public static boolean isBalancedParentheses(String parentheses) {
        Stack<Character> demoStack = new Stack<>();

        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                demoStack.push(p);
            }
            else if (p == ')') {
                if (demoStack.isEmpty() || demoStack.pop() != '(') {
                    return false;
                }
            }
        }

        return demoStack.isEmpty(); // returns true/false value based on if all parentheses matched
    }

    public static void main(String[] args) {
        String str1 = "()()(()";
        String str2 = ")(())";
        String str3 = "((()()()))";
        System.out.println(isBalancedParentheses(str1)); // false
        System.out.println(isBalancedParentheses(str2)); // false
        System.out.println(isBalancedParentheses(str3)); // true
    }
}

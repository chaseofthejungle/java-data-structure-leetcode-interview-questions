public class Main {
    public static String findLongestString(String[] strList) {
        String longestStr = "";
        for (String str: strList) {
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        return longestStr;
    }

    public static void main(String[] args) {
        String[] strList1 = {"Minnesota", "Wisconsin", "Pennsylvania", "Florida", "New York"};
        String longest1 = findLongestString(strList1);
        System.out.println("Longest String in Array #1: " + longest1);  // "Pennsylvania"

        String[] strList2 = {"Canada", "Mexico", "United States", "England", "Turkey", "China"};
        String longest2 = findLongestString(strList2);
        System.out.println("Longest String in Array #2: " + longest2);  // "United States"

        String[] strList3 = {"1", "11", "111", "1111", "11111"};
        String longest3 = findLongestString(strList3);
        System.out.println("Longest String in Array #3: " + longest3);  // "11111"
    }
}

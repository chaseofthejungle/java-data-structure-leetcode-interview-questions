import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str: strings) { // for each string in the array
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);

            if (anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                anagramGroups.put(canonical, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        System.out.println("1st Set of Anagrams:");
        System.out.println(groupAnagrams(new String[]{"soap", "java", "rest", "net", "ten"})); // [[java], [rest], [net, ten], [soap]]

        System.out.println("\n2nd Set of Anagrams:");
        System.out.println(groupAnagrams(new String[]{"spock", "kirk", "elo", "mccoy", "archer", "leo"})); // [[mccoy], [kirk], [elo, leo], [archer], [spock]]

        System.out.println("\n3rd Set of Anagrams:");
        System.out.println(groupAnagrams(new String[]{"nick", "jalen", "nor", "don", "ron", "randall", "danrall"})); // [[nor, ron], [don], [nick], [jalen], [randall, danrall]]
    }
}

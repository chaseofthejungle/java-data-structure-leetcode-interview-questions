import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static List<Integer> removeDuplicates(List<Integer> initialList) {
        Set<Integer> uniqueSet = new HashSet<>(initialList);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<Integer> initialList = List.of(1, 2, 10, 4, 3, 1, 8, 5, 7, 9, 6, 3, 4, 8, 9);
        List<Integer> newList = removeDuplicates(initialList);
        System.out.println(newList); // returns 1 through 10, possibly out of order (Sets are not ordered)
    }
}

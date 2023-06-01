package preparation.set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Hello");
        set.add("Test");
        System.out.println(set);
    }
}

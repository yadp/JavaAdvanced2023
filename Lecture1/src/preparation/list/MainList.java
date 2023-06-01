package preparation.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Test");
        list.add("Hello");
        list.add("Hello");
        list.add("dsada");


        /*
        [Test,Hello]


         */
        int uniq= 0;
        int initialSize =list.size();
        for (int i = 0; i <initialSize; i++) {
            String tempString = list.get(0);
            list.remove(0);
            if(!list.contains(tempString)){
                uniq++;
            }
        }

        System.out.println(uniq);





        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        System.out.println(set.size());
    }
}

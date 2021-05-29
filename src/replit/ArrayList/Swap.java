package replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        int post1 = 0; int post2 = 3;
        List<String> list = Arrays.asList("a","c","b","d","e");
        ArrayList<String> newList = new ArrayList<>();
        for (String each : list){
            newList.add(each);
        }
        newList.remove(post1);
        newList.add(post1, list.get(post2));
        newList.remove(post2);
        newList.add(post2, list.get(post1));
        System.out.println(newList);

    }
}

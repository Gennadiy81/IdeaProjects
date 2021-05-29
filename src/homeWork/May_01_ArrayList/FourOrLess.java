package homeWork.May_01_ArrayList;

import java.util.*;

public class FourOrLess {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut");
        //ArrayList<String> words = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> forOrLess = new ArrayList<>();
        for (String each : words) {
            if (each.length() <= 4) {
                forOrLess.add(each);
            }
        }
        System.out.println(forOrLess);
    }
}

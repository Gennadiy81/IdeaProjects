package homeWork.May_01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HidePasswordTwo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "hi", "hold");

        System.out.println( wordsToStars(words));

    }
    public static List<String> wordsToStars(List<String> starts){
        List<String>stars = new ArrayList<>();
        List<String> words = Arrays.asList("one", "hi", "hold");
        String temp = "";
        for (String each: words){
            temp = "";
            for (int i = 0; i < each.length(); i++) {
                temp += "*";
            }
            stars.add(temp);
        }
       return stars;
    }
}


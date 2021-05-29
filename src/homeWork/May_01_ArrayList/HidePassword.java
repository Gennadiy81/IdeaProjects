package homeWork.May_01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HidePassword {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "hi", "hold");
        wordsToStars(words);

    }
    public static void wordsToStars(List<String> starts){
        List<String>stars = new ArrayList<>();
        String temp = "";
        for (String each: starts){
            temp = "";
            for (int i = 0; i < each.length(); i++) {
                temp += "*";
            }
            stars.add(temp);
        }
        System.out.println(stars);
    }
}

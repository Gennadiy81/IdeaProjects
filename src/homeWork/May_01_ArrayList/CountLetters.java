package homeWork.May_01_ArrayList;

import java.util.*;

public class CountLetters {
    public static void main(String[] args) {
        countLetters();
    }
    public static void countLetters(){
        List<String> words = Arrays.asList("java", "html", "css",
                "java", "javascript", "selenium");
        int count = 0;
       String arr = "";
        for (int i = 0;i < words.size(); i++){
            arr = words.get(i);
            for (int j = 0; j < arr.length(); j++) {
                if (arr.charAt(j) == 'a'){
                    count++;
                }
            }
        }
        System.out.println(count);//
    }
}

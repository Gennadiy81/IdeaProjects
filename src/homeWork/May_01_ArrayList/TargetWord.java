package homeWork.May_01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class TargetWord {
    public static void main(String[] args) {
        targetWord();

    }
    public static void targetWord(){
        List<String> words = Arrays.asList("java", "html", "css",
                "java", "javascript", "selenium");
        int count = 0;
        for (String each : words){
            if (each.equals("java")){
                count++;
            }
        }
        System.out.println(count);
       }
    }


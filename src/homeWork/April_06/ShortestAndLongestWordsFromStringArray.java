package homeWork.April_06;
import java.util.*;
public class ShortestAndLongestWordsFromStringArray {
    public static void main(String[] args) {
        String[] word = {"java", "is", "getting", "into", "my dreams"};
        String longestWord = "";
        for (String each : word){
            if (longestWord.length() < each.length()){
                longestWord = each;
            }
        }
        System.out.println("Longest word - " + longestWord);

        String shortestWord = word[0];
        for (String each : word){
            if (each.length() < shortestWord.length()){
                shortestWord = each;
            }
        }
        System.out.println("Shortest word - " + shortestWord);

        Arrays.sort(word);
        System.out.println(word);
        System.out.println("\nLongest word - " + word[word.length-1]);
        System.out.println("Shortest word - " + word[0]);

    }
}

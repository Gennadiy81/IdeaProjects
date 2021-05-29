package replit.Methods;
import java.util.*;
public class AnagramAskGroup {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "Silent";
         word1 = word1.toLowerCase();
         word2 = word2.toLowerCase();

        String word1ToString = "";
        String word2ToString = "";

        String [] word1Sort = word1.split("");
        String [] word2Sort = word2.split("");

        Arrays.sort(word1Sort);
        Arrays.sort(word2Sort);

        for (int i = 0; i < word1Sort.length; i++){
            word1ToString += word1Sort[i] + "";
            word2ToString += word2Sort[i] + "";

        }
        if (word1ToString.contains(word2ToString)){
            System.out.println(true);
        }
        }
    }


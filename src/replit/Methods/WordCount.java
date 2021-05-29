package replit.Methods;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
    public static int wordCount(String words) {
        // your code
        String [] wordArray = words.split(" ");
        int num = wordArray.length;
        System.out.println(num);
        return num;
    }
}

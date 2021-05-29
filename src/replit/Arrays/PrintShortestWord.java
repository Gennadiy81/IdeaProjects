package replit.Arrays;

import java.lang.reflect.Array;
import java.util.*;
public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String [] words = str.split(", ");
        String allShort = "";


        String shortestWord = words[0];

        for (int i = 0; i < words.length; i++){
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        for (int i = 0; i < words.length; i++){
            if( shortestWord.length() == words[i].length()){
                allShort += words[i] + "," ;
            }
        }
      String[] newShorts = allShort.split(",");
        Arrays.sort(newShorts);
       System.out.println(Arrays.toString(newShorts));
    }
}

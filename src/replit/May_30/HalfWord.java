package replit.May_30;
import java.util.*;
public class HalfWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

       // int halfIndex = word.length() /2;
      // String halfWord = word.substring(0, halfIndex);
       // System.out.println(halfWord + halfWord);

        int length = word.length();
        String wordNoEnd = word.substring(0, length-1);
        System.out.println(wordNoEnd);



    }
}

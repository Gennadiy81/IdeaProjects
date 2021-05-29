package replit.May_30;
import java.util.*;
public class WordsComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
       // String word2 = s.next();

        //your code here
        if(word.length() < 5){
            System.out.println("Too short!");
        }else if(word.length() > 5){
            System.out.println( "Too long!");
        }else{
            char letter1 = word.charAt(0);
            char letter2 = word.charAt(1);
            char letter3 = word.charAt(2);
            char letter4 = word.charAt(3);
            char letter5 = word.charAt(4);
            System.out.println(letter5 + "" + letter4 + "" + letter3 + "" + letter2 + "" + letter1);
        }


    }
}

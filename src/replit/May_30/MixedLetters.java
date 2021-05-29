package replit.May_30;
import java.util.*;
public class MixedLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        if(word1.length() != 3 && word2.length() != 3 ){
            System.out.println("cannot merge");
        }else if(word1.length() == 3 && word2.length() == 3 ){
            char letter1 = word1.charAt(0);
            char letter2 = word1.charAt(1);
            char letter3 = word1.charAt(2);
            char letter1a = word2.charAt(0);
            char letter2a = word2.charAt(1);
            char letter3a = word2.charAt(2);
            System.out.println(letter1 + ""+ letter1a + "" + letter2 + "" + letter2a + "" + letter3 + "" + letter3a);









        }


    }
}



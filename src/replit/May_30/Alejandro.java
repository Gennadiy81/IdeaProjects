package replit.May_30;
import java.util.*;
public class Alejandro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if(word.length() < 5){
            System.out.println("Too short!");
        }else if(word.length()> 5){
            System.out.println( "Too long!");
        }else{
            System.out.println(word);
        }

    }
}


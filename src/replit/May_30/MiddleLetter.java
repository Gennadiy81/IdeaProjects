package replit.May_30;
import java.util.*;
public class MiddleLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = word.length();
        int midPoint = count / 2;
        if (count % 2 != 0 && count >= 3) {

            System.out.println(word.substring(midPoint, midPoint+1));

         }else if(count == 1){
        System.out.println(word + word + word);
    }else if(count % 2 == 0 && count > 4){

        System.out.println(word.substring(midPoint-1, midPoint +1));
    }else if(count == 2){
        System.out.println(word + word);
    }
    }
}





/*
int counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter +=100;
        }while (counter <= 1000);




        int apples = 0;
        while (apples <= 3){
            System.out.println("apples -> " + apples);
            apples++;
 */
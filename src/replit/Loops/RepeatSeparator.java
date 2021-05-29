package replit.Loops;
import java.util.*;
public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        int i = 0;
        String output = "";

            for (i = 1; i <= count; i++){
                if( i > 1){
                    output += word + separator;
                }
            }
        System.out.println(output + word);
    }
}


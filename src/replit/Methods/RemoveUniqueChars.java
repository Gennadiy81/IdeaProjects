package replit.Methods;
import java.util.*;
public class RemoveUniqueChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }
    public static String uniqueChars(String str) {
        String unique = "";
        for (int i=0; i < str.length(); i++){

            if(!unique.contains(str.charAt(i) +"")) {
                unique += str.charAt(i);
            }
        }
        return unique;
        }


    }






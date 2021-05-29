package homeWork.March_30;
import java.util.*;
public class PalindromeWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine(), reversWord = "";

        for (int i = word.length() -1; i >=0; i--){
            reversWord = reversWord + word.charAt(i);
        }
        System.out.println(reversWord);
        if (word.equalsIgnoreCase(reversWord)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}


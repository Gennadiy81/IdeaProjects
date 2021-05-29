package GroupStadies.May29;
import java.util.*;
public class PalindromeWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word =scan.next(), reversWord = "";

        for (int i = word.length()- 1; i >= 0; i--) {
            reversWord = reversWord + (word.charAt(i));
        }
        System.out.println();
        if (word.equalsIgnoreCase(reversWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


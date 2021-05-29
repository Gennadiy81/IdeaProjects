package GroupStadies.May29;
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length");
        int n = scan.nextInt();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (alphabet.length() > 0 && alphabet.length() <= 26)
            for (int i = 0; i < alphabet.length() - (n-1); i++) {
                System.out.println(alphabet.substring(i, i + n));

        }else{
            System.out.println("Invalid number");
        }
    }
}

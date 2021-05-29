package replit.Loops;
import java.util.*;
public class PrintVowels {
    public static void main(String[] args) {
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u','y','j'));
        String str = "gennadiy";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (vowelSet.contains(c)) {
                System.out.println(c);

            }
        }

    }
}


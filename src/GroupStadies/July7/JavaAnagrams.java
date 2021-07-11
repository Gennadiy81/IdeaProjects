package GroupStadies.July7;

import java.util.Arrays;
import java.util.Locale;

public class JavaAnagrams {
    public static boolean isAnagram(String a, String b) {
        out:
        if (a.length() >= 1 && a.length() <= 50 && b.length() >= 1
                && b.length() <= 50 && a.length() == b.length()) {
            String aTemp = a.toLowerCase(Locale.ROOT);
            String bTemp = b.toLowerCase(Locale.ROOT);
            String[] arrayA = aTemp.split("");
            String[] arrayB = bTemp.split("");
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            String tempA = "";
            String tempB = "";

            for (int i = 0; i < arrayA.length; i++) {
                if (a.charAt(i) < 65 || a.charAt(i) > 122) {
                    break out;
                }
                tempA += arrayA[i] + "";
                tempB += arrayB[i] + "";

            }
            if (tempA.equals(tempB)) {
                return true;

            } else {

            }
        }
        return false;
    }

    public static void isAnagramTwo(String a, String b) {
        int wordCount = 0;
        if (JavaAnagrams.isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        System.out.println("Character | Frequency: " + a + " | Frequency: " + b);
        a = a.toLowerCase(Locale.ROOT);
        b = b.toLowerCase(Locale.ROOT);
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(Character.toUpperCase(letter) + " or " + letter +
                        " \t  | " + wordCount + " \t \t \t \t | " + wordCount);
                wordCount = 0;

            }
        }
    }
}



 class JavaAnagramsTest{
     public static void main(String[] args) {
//         boolean words = JavaAnagrams.isAnagram("CaT", "tAc");
//         System.out.println(words);
         JavaAnagrams.isAnagramTwo("Anagramo", "margana");

     }

}

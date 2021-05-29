package replit.Methods;
import java.util.*;
public class MargeTwoWords {
    public static String mergeStrings(String one, String two) {
        String word = "";
        if (one.length() >= two.length()) {
            for (int i = 0, j = 0; i < one.length(); i++, j++) {
                word += one.charAt(i);
                if (j < two.length()) {
                    word += two.charAt(j);
                }
            }
            return word;
        }
        if (two.length() >= one.length()) {
            for (int n = 0, k = 0; n < two.length(); n++, k++) {
                if (k < one.length()) {
                    word += one.charAt(k);
                }
                word += two.charAt(n);
            }
        }
        return word;
    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(mergeStrings(in.next(), in.next()));
        }
    }



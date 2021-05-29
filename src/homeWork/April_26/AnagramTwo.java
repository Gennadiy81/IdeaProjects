package homeWork.April_26;
import java.util.*;
public class AnagramTwo {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cba"));

    }
    public static boolean isAnagram(String one, String two){
        if (one.length() != two.length()){
            return false;
        }
        one = one.toLowerCase();
        two = two.toLowerCase();
        int [] count = new int[26];
        for (int i=0; i < one.length(); i++) {
        char letterFromOne = one.charAt(i); // b -> 98 - 97 = 1
        char letterFromTwo = two.charAt(i);
        count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
        count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;

        // System.out.println(Arrays.toString(count));
    }

        return Arrays.equals(count, new int[26]);
    }
}

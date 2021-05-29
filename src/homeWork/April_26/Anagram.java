package homeWork.April_26;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagramString("java", "avaj"));
    }
    public static boolean anagramString(String word1, String word2) {
        String[] strOne = word1.split("");
        Arrays.sort(strOne);
        String[] strTwo = word2.split("");
        Arrays.sort(strTwo);
        String wordOne = "";
        String wordTwo = "";
        for (int i = 0; i < word1.length(); i++) {
            wordOne += strOne[i];
            wordTwo += strTwo[i];
        }
        if (wordOne.equals(wordTwo)) {
            return true;
        } else {
        }
        return false;

    }
}



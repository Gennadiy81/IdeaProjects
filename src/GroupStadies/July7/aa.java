package GroupStadies.July7;

import java.util.ArrayList;
import java.util.Arrays;

public class aa {

    public static void main(String[] args) {
        String word = "AADDDQI";
        for (int i = 0; i < word.length(); i++) {
           // if ()

        }
        }



    public static String withoutDuplicatesWay1(String word) {
        String[] tempArr = word.split("");
        Arrays.sort(tempArr);
        String temp = "";
        for (int i = 0; i < tempArr.length; i++) {
            if (i + 1 == tempArr.length) {
                temp += tempArr[i];
                break;
            } else if (!tempArr[i].equals(tempArr[i + 1])) {
                temp += tempArr[i];
            }
        }
        return temp;
    }

    public static String withoutDuplicatesWay2(String word) {
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            if (!temp.contains(word.charAt(i) + "")) {
                temp += word.charAt(i);
            }
        }
        return temp;
    }

    public static String withoutDuplicatesUseSB(String wordParam){
        StringBuilder word = new StringBuilder(wordParam);
        return wordParam;
    }

    public static String uniqueCharacters(String word){
        String temp = "";
        int countA;
        for (int i = 0; i < word.length(); i++) {
            countA = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    countA++;
                }
            }
            if (countA == 1){
                temp += word.charAt(i);
            }
        }
        return temp;
    }
}



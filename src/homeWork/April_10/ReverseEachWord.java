package homeWork.April_10;

import java.util.Arrays;

public class    ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("java is fun"));
        }

    public static String reverseEachWord(String sentence){
       // String sentence = "It started to snow in Chicago";
        String[] wordsArrays = sentence.split(" ");
        String reversSentence ="";
        String reversWord = "";
        String letters = "";
        for (int i = 0; i < wordsArrays.length; i++){
            reversWord = "";
            letters = wordsArrays[i];
            for (int n = letters.length()-1; n >= 0; n--){
                reversWord += letters.charAt(n);
            }
           reversSentence += reversWord+" ";

    }
        return reversSentence.trim();
}
}
//   /*
//    public class ReverseEachWord {
//    /*
//    Reverse Each word
//    Given a String, reverse each individual word and print the result Hint: Use a nested loop, split
//    Input:
//    It started to snow in Chicago
//    Output:
//    tI detrats ot wons ni ogacihC
//
//     */
//
//    public static void main(String[] args) {
//        System.out.println(reverseEachWord("It started to snow in Chicago"));
//    }
//
//    public static String reverseEachWord(String str) {
//
//        String reverse = "";
//
//        for(String each : str.split(" ")){
//
//            reverse += StringUtils.reverse(each) + " ";
//
//        }
//
//        return reverse.trim();
//
//    }
//
//}



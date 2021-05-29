package homeWork.April_26;

import java.util.Arrays;

public class SumOfNumbersFromString {
    public static void main(String[] args) {
      sumOfString("a5bc12def100g");
    }
    public static void sumOfString(String str){
        String word = "a5bc12def100g";
        String wordNumbers = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
                wordNumbers += word.charAt(i) +"";
                if(Character.isAlphabetic(word.charAt(i+1))){
                    wordNumbers+= " ";
                }
            }
        }
        int sum = 0;
        wordNumbers = wordNumbers.trim();
        String nums[] = wordNumbers.split(" ");
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            sum += num;
        }
        System.out.print(sum);
    }
}

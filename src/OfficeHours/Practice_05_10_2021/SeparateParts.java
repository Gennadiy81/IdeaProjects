package OfficeHours.Practice_05_10_2021;

import java.util.ArrayList;

public class SeparateParts {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        String str = "ABCD123$%#@&456EFG!";

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isLetter(eachChar)){
                digits.add(eachChar);
            }else if(Character.isDigit(eachChar)){
                letters.add(eachChar);
            }else {
                special.add(eachChar);


            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(special);

    }
}

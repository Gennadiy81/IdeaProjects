package GroupStadies.May30;

import java.util.Scanner;

public class TwoStringsTogether {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two String values");
        String wordA = input.nextLine();
        String wordB = input.nextLine();

        if(wordA.length() > wordB.length()){
             int wordA1 = wordA.length() - wordB.length();
            System.out.println(wordA.substring(wordA1) + wordB);
        }else if (wordB.length() > wordA.length()){
            int wordB1 = wordB.length() - wordA.length();
            System.out.println(wordA + wordB.substring(wordB1));
        }else{
            System.out.println(wordA + wordB);
        }
    }
}
 /*
        Gennadiy: Given two strings, append them
        together (known as "concatenation")wordB2-wordA.length()+1
        and return the result. However,
        if the strings are different lengths,
         omit chars from the longer string
         so it is the same length as the shorter string.
          So "Hello" and "Hi" yield "loHi".
          The strings may be any length.

        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
         minCat("java", "Hello") → "javaello"
        */
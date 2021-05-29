package JavaClasses.day32_arays_split;
import java.util.*;
public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fan";
        String[] word = sentence.split(" ");
        System.out.println("1st word = " + word[0]);
        System.out.println("2st word = " + word[1]);
        System.out.println("3st word = " + word[2]);
        //System.out.println("4st word = " + word[3]);

        for (String  each : word){
            System.out.println(each);
        }
            String googleResult = "About 1,810,000 results (0.68 seconds)";
            String[] result = googleResult.split(" ");
            System.out.println("count = " + result[1]);
            System.out.println("seconds = " + result[3].substring(1));

    }
}

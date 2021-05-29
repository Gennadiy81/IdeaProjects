package JavaClasses.day32_arays_split;
import java.util.Arrays;
public class SplitMethodIQImportant {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);
        String sentence = "today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println ("Number of words in sentence - " +  sentenceArray.length);
        System.out.println(sentenceArray[0]);
        System.out.println(sentence.split(" ")[0]);
        System.out.println();

        for (String each : sentenceArray){
            System.out.println(each);
        }
    }
}

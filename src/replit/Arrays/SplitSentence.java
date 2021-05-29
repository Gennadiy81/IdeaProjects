package replit.Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] arr = sentence.split(" ");
        for(String each : arr){
            System.out.println(each);
        }
    }
}

package replit.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";

        //TODO: start your code here
        String reverse = "";
        String[] splitSentence = sentence.split(" ");
        for(int i = splitSentence.length-1; i >= 0; i--){
            reverse += splitSentence[i] + " ";
        }
        System.out.println(reverse);
    }
}

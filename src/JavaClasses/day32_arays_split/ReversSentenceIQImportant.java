package JavaClasses.day32_arays_split;

public class ReversSentenceIQImportant {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] splitSentence = sentence.split(" ");
        String str = "";
        for (int i = splitSentence.length-1; i >= 0; i-- ){
            System.out.print(splitSentence[i] + " ");
            str += " " + splitSentence[i];

        }
        System.out.println();
        System.out.println(str.trim());
    }
}

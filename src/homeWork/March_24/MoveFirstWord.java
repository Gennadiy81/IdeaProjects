package homeWork.March_24;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "Java is a fun language";

        System.out.println(sentence.replace("Java", "")
                .replace("language", "language Java"));
    }
}

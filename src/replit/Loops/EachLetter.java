package replit.Loops;

public class EachLetter {
    public static void main(String[] args) {
        String word = "java";
        for (int i =0; i <= word.length()-1; i++){
            System.out.println(word.charAt(i));
        }
    }
}

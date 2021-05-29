package homeWork.April_06;

public class WordJava {
    public static void main(String[] args){
        String word = "java";

        for(int outer = 0; outer < word.length(); outer ++){
            for (int inner = 0; inner <= outer; inner ++){
                System.out.print(word.charAt(inner));
            }
            System.out.println();
        }
        for (int outer = word.length()-1; outer >= 0; outer--){
            for (int inner = outer; inner >= 0; inner--){
                System.out.print(word.charAt(inner));
            }
            System.out.println();

        }
        for (int outer = 0; outer < word.length(); outer++){
            for (int inner = outer; inner < word.length(); inner++){
                System.out.print(word.charAt(inner));
            }
            System.out.println();
        }
    }

}

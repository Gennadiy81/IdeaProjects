package homeWork.April_01;

public class UpperOrLower {
    public static void main(String[] args) {
        String word = "lower";
        String word2 = "Descending";
        if (word.equals("Upper") && word2.equals("Ascending")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i);
            }
        } else if (word.equals("Upper") && word2.equals("Descending")) {
            for (char i = 'Z'; i >= 'A'; i--) {
                System.out.print(i);
            }
        } else if (word.equals("lower") && word2.equals("Ascending")) {
            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(i);

            }
        } else if (word.equals("lower") && word2.equals("Descending")) {
            for (char i = 'z'; i >= 'a'; i--) {
                System.out.print(i);
            }
        }
    }
}
package replit.Loops;

public class PrintTriangle {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int j = 1;
        String word = "";
        for (i = i; i <= n; i++) {
            word = word + "*";

            System.out.println(word);
        }
    }
}

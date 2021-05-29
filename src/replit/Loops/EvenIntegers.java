package replit.Loops;

public class EvenIntegers {
    public static void main(String[] args) {
        String evenNumber =" ";
        for (int i = 80; i >= 0; i--){
           if (i % 2 == 0 && i >= 20){
                evenNumber +=i;
                System.out.print(" ");
                System.out.print(i);

            }
        }
    }
}

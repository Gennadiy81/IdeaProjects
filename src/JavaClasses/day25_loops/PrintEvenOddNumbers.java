package JavaClasses.day25_loops;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers 1 - 100");

        for (int num = 0; num < 100; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");


            }
        }
        System.out.println();
        System.out.println("Odd numbers 1 -100");
        for (int k = 0; k < 100; k++) {
            if (k % 2 != 0) {

                System.out.print(k + " ");
            }
        }
    }
}

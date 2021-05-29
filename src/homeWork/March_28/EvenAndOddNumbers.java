package homeWork.March_28;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int sum = 0, sum2 = 0;
        System.out.println("Sum of even numbers.");
        for (int num = 0; num <= 100; num++) {
            if (num % 2 == 0) {
                sum += num;
                System.out.print(sum + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of odd numbers.");

        for (int num1 = 0; num1 <= 100; num1++) {
            if (num1 % 2 != 0) {
                sum2 += num1;
                System.out.print(sum2 + " ");


            }
        }
    }
}

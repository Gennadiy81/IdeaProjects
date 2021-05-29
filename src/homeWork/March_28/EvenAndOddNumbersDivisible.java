package homeWork.March_28;

public class EvenAndOddNumbersDivisible {
    public static void main(String[] args) {
        //int sum = 1, sum2 = 1;
        System.out.println("Even numbers divisible by 3 and 5");
        for (int num1 = 0; num1 <= 100; num1++) {
            if (num1 % 3 == 0 && num1 % 5 == 0 && num1 % 2 == 0) {
                //sum += num1;
                System.out.print(num1 + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers divisible by 3 and 5");
        for (int num2 = 0; num2 <= 100; num2++) {
            if (num2 % 3 == 0 && num2 % 5 == 0 && num2 % 2 != 0) {
                // sum2 += num1;
                System.out.print(num2 + " ");

            }
        }
    }
}





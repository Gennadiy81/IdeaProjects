package replit.Methods;
import java.util.*;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE
        int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887};
        for (int i = 0; i < fib.length; i++) {
            if (num == fib[i]) {
                System.out.println(fib[num]);


            }
        }
    }
}





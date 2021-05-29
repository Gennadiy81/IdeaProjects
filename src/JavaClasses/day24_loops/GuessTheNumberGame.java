package JavaClasses.day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);

        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;

        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();

            if (secretNumber < guessingNumber) {
                System.out.println("Secret number is to large");
            } else if (secretNumber > guessingNumber) {
                System.out.println("Secret number is to small");
            } else if (secretNumber == guessingNumber) {
                System.out.println("Secret number is correct");
            }

            } while (guessingNumber != secretNumber) ;



        }
    }






























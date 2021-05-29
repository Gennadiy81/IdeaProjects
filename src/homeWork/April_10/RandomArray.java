package homeWork.April_10;
import java.util.*;
public class RandomArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("How many numbers do you want?");
        int arrayNumbers = scan.nextInt();
        System.out.println("What is the max number value");
        int maxValue = scan.nextInt();
        int[] num = new int[arrayNumbers];
        for (int i = 0; i < num.length; i++){
            num[i] = randomNumber.nextInt(maxValue);
            }
        System.out.println(Arrays.toString(num));

        }
    }


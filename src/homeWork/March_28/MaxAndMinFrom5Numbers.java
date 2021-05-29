package homeWork.March_28;
import java.util.*;
public class MaxAndMinFrom5Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number five times");
        int num1, num2, num3, num4, num5;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("Biggest number - " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("Biggest number - " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("Biggest number - " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("Biggest number - " + num4);
        } else if (num5 > num1 && num5 > num2 && num5 > num4 && num5 > num3) {
            System.out.println("Biggest number - " + num5);
        } else {
            System.out.println("Invalid number");
        }
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("Smallest number - " + num1);
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.println("Smallest number - " + num2);
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            System.out.println("Smallest number - " + num3);
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
            System.out.println("Smallest number - " + num4);
        } else if (num5 < num1 && num5 < num2 && num5 < num4 && num5 < num3) {
            System.out.println("Smallest number - " + num5);
        } else {
            System.out.println("Invalid number");

        }
    }
}



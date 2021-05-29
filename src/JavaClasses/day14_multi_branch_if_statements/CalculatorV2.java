package JavaClasses.day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = scan.nextInt();
        System.out.println("Enter second number:");
        num2 = scan.nextInt();
        System.out.println("Enter third number:");
        num3 = scan.nextInt();
        int mediumValue = (num1 + num2 + num3) / 3;
        System.out.println("Medium value is: " + mediumValue);

    }
}
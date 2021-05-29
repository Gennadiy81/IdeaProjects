package homeWork.March_20;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("==========Calculator==========");
    System.out.println("Enter number1");
    double num1 = scan.nextDouble();
    System.out.println("Enter condition");
    String result = scan.next();
    System.out.println("Enter number2");

    double num2 =scan.nextDouble();

    switch(result){
        case "+":
            System.out.println(num1 + num2);
            break;
        case "-":
            System.out.println(num1 - num2);
            break;
        case "*":
            System.out.println(num1 * num2);
            break;
        case "/":
            System.out.println(num1 / num2);
            break;
    }

}
}

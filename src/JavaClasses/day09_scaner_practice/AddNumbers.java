package JavaClasses.day09_scaner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int result = num1 + num2 + num3;

        System.out.println("Result:" + result);



    }
}

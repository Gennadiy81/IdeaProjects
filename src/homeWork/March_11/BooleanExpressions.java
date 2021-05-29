package homeWork.March_11;
//import java.util.Scanner;
public class BooleanExpressions {
    public static void main(String[] args){
       // Scanner scan = new Scanner(System.in);
        //double num = scan.nextDouble();
        double  num =30;
        double num1 = (num % 2), num2 = (num % 3), num3 = (num % 5);
        System.out.println(num + " is divisible by 2: " + (num1 == 0));
        System.out.println(num + " is divisible by 3: " + (num2 == 0));
        System.out.println(num + " is divisible by 5: " + (num3 == 0));




    }
}

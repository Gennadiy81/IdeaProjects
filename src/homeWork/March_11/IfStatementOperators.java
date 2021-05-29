package homeWork.March_11;
import java.util.Scanner;

public class IfStatementOperators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

    }

}

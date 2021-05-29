package homeWork.March_11;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int leapYear = scan.nextInt();
        if((leapYear % 4) == 0){
            System.out.println(leapYear + " is a leap year" );
        }else{
            System.out.println(leapYear + " Is not a leap year");
        }
    }
}

package JavaClasses.day26_loops;
import java.util.*;
public class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n= scan.nextInt();

        for (int day = n; day == n; day++) {
            switch (day) {
                case 1:
                    System.out.println(" 1 - Monday");
                    break;
                case 2:
                    System.out.println(" 2 - Tuesday");
                    break;
                case 3:
                    System.out.println(" 3 - Wednesday");
                    break;
                case 4:
                    System.out.println(" 4 - Thursday");
                    break;
                case 5:
                    System.out.println(" 5 - Friday");
                    break;
                case 6:
                    System.out.println(" 6 - Saturday");
                    break;
                case 7:
                    System.out.println(" 7 - Sunday");
                    break;
                default:
                    System.out.println("Invalid number");
                    break;


            }
        }
    }
}










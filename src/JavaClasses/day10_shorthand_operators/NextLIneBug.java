package JavaClasses.day10_shorthand_operators;
import java.util.Scanner;

public class NextLIneBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        scan.nextLine();//fix the bug. Work around
        String month = scan.nextLine();// Whenever use scan.nextLine()
        // after scan.nextDouble(), nexInt, nextBoolean,...
        System.out.println("Rent = " + rent);
        System.out.println("Month = " + month);
    }
}

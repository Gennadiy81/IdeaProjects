package JavaClasses.day09_scaner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        //double hourlyRate = 50;
        //double weeklyPay = hourlyRate * 40;
        //double monthlyRate = weeklyPay * 4;
       //double yearSalary = weeklyPay * 52;
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyRate = weeklyPay * 52/12;
        double yearlySalary = monthlyRate *12;
        System.out.println("Weekly pay:-$" + weeklyPay);
        System.out.println("Monthly pay:-$" + monthlyRate);
        System.out.println("Year salary:-$" + yearlySalary);
    }
}

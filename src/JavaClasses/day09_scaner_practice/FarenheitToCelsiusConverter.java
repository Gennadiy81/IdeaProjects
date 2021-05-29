package JavaClasses.day09_scaner_practice;
import java.util.Scanner;

public class FarenheitToCelsiusConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("###### TEMPERATURE CONVERTER #########");
        System.out.println("Enter Fahrenheit: ");
        //double celsius = 32;
        double fahrenheitValue = input.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5/9;
        System.out.println("Celsius: \n" + celsiusValue);

    }
}

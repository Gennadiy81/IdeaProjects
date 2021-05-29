package OfficeHours.Practice_03_08_2021;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Hard coded values
       // double length = 5;
       // double width = 3;
       // double perimeter = 2 * (length + width);
       // double area = length * width;
        System.out.println("Enter your length");
        double length = scan.nextDouble();
        System.out.println("Enter your with");
        double width = scan.nextDouble();
        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}

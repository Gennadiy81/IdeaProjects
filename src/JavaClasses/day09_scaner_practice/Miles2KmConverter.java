package JavaClasses.day09_scaner_practice;


import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("##### MILES TO KM CONVERTER #####");
        System.out.println("Enter miles:");
        //double miles = 10.0;
        double miles =scan.nextDouble();
        double kilometer = miles * 1.609;
        System.out.println(miles + " miles in kilometers " + kilometer);



        /*
        add new class Miles2KmConverter
add main method
import scanner
create scanner object
miles, kilometers

Enter miles:
10
10 miles in kilometer: 16.0934

---------
formula:
kilometers -> miles * 1.609
You do not have permission to send messages in this channel.

         */
    }
}

package JavaClasses.day09_scaner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price for milk:");
        double price1 = scan.nextDouble();

        System.out.println("Enter price for bread:");
        double price2 = scan.nextDouble();

        System.out.println("Enter price for cucumber:");
        double price3 = scan.nextDouble();

        double totalPrice = price1 + price2 + price3;
        System.out.println("Total:" + totalPrice);


        /*
        Add a new class GroceryShopping
add main method
import scanner
create scanner object

    Target

    milk, bread, cucumber

FLOW:
    Enter price for milk:
    3.99
    Enter price for bread:
    2.55
    Enter price for cucumbers:
    4.10
    Total is $10.33

price1, price2, price3, total
You do not have permission to send messages in this channel.

         */
    }
}

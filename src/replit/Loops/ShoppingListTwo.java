package replit.Loops;
import java.util.*;
public class ShoppingListTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "", item1 = " ";
        String countinue = "";
        double price = 0, price1 = 0;
        int count = 1;
        double totalPrice = 0;
        System.out.println("Enter Item" + count + " and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();
        shoppingListReport += item + " ";
        totalPrice += price;
        do {
            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equals("yes")) {
                count++;
                System.out.println(" Enter Item" + count + " and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport += "Item" + count + ": " + item + " Price : " + price;
                totalPrice += price;

            }else{
                break;
                }

        }while (countinue.equals("yes"));
        System.out.println("Item1: " + item1 + " Prise: " + price1 + ", " + shoppingListReport);
        System.out.println("Total price:" + (totalPrice + price1));
        }
    }











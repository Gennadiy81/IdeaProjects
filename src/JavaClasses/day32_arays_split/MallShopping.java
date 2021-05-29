package JavaClasses.day32_arays_split;

import java.sql.SQLOutput;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        int i = 0;

        System.out.println("----- FIND THE INDEX OF 'CLOVES' IN ITEM ARRAY -----");
        for (String each : items) {
            i++;
            if (each.equals("Gloves")) {
                System.out.println("Gloves found in index - " + (i - 1));
                break;
            }
        }
        System.out.println("----- Check if iPad exists -----");
        boolean iPadExists = false;
        for (String each : items) {
            if (each.equalsIgnoreCase("iPad")){
                iPadExists = true;
                System.out.println("Ipod Exists - " + iPadExists);
                break;
            }
        }

        System.out.println("----- Print a report -----");

        for (int n = 0; n < items.length; n++){
            System.out.println(items[n] + "\t-\t$" + prices[n] + "\t- #" + itemIDs[n]);
        }

        System.out.println("----- Look for jacket -----");


      for (int n = 0; n < items.length; n++)
            if (items[n].equalsIgnoreCase("jacket")) {
                System.out.println(items[n] + "\t-\t$" + prices[n] + "\t- #" + itemIDs[n]);
                break;
            }






    }
}

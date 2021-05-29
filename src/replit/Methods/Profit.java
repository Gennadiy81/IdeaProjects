package replit.Methods;
import java.util.*;
public class Profit {
    public static String profits  (int buyPrice, int sellPrice) {
        //your code here
        if (buyPrice < sellPrice) {
            return "profit";
        } else {
            if (buyPrice > sellPrice) {
                return "loss";

            } else if (buyPrice == sellPrice) {

            }
            return "no loss";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
}

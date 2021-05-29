package homeWork.March_02;
import java.util.Scanner;

public class HomeDepotRecite {
    public static void main(String[] args){
        Scanner form = new Scanner(System.in);
        System.out.println("Enter plywood price");
        double plywood = form.nextDouble();
        System.out.println("Enter drywall price");
        double drywall = form.nextDouble();
        System.out.println("Enter nails price");
        double nails = form.nextDouble();
        double taxElevenPr = (plywood + drywall + nails) * 0.11;
        System.out.println("Tax: $" + taxElevenPr);
        double total = plywood + drywall + nails + taxElevenPr;
        System.out.println("Total: $" + total);
    }
}

package homeWork.March_02;
import java.util.Scanner;

public class MenardsRecite {
    public static void main(String[] args){
        Scanner from = new Scanner(System.in);
        System.out.println("Enter pine boards pieces");
        int boardPc =from.nextInt();
        double boardTotal = boardPc * 20.99;
        System.out.println("Pine boards total: $" + boardTotal);
        System.out.println("Enter drywall pieces");
        int drywallPc = from.nextInt();
        double drywallTotal = drywallPc * 10.64;
        System.out.println("Drywall total: $" + drywallTotal);
        System.out.println("Enter plywood pieces");
        int plywoodPc = from.nextInt();
        Double plywoodTotal = plywoodPc * 45.87;
        System.out.println("Plywood total: $" + plywoodTotal);
        double totalBeforeTax = boardTotal + drywallTotal + plywoodTotal;
        System.out.println("Total before tax; $" + totalBeforeTax);
        System.out.println("Enter tax percent ");
        double taxPercent = from.nextDouble();
        double totalTaxPercentCharge = totalBeforeTax / 100 * taxPercent;
        System.out.println("Sale tax: $" + totalTaxPercentCharge);
        System.out.println("Total sale price: $" + (totalBeforeTax + totalTaxPercentCharge));

    }
}

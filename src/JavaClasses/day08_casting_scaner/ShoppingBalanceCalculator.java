package JavaClasses.day08_casting_scaner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88, price2 = 89.99, price3 = 15,
                remainingBalance = balance - (price1 + price2 + price3), allSpend = price1 + price2 + price3;
        System.out.println("Your initial balance: " + "$" + balance);
        System.out.println("All spend: " + "$" + allSpend);
        System.out.println("Your remaining balance: " + "$" + remainingBalance);


        int balanceWithNoCents = (int)remainingBalance;
        System.out.println("Your balance with out cents: " + "$" + balanceWithNoCents);

    }
}

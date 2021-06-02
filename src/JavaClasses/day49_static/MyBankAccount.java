package JavaClasses.day49_static;

public class MyBankAccount {
    static double balance = 50;
    static double newBalance;
    String user;
    public void spend(double amount){
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }

    public void showBalance(){
        System.out.println("Current balance is $" + balance);
    }
    public static void addToBalance(double newBalance){
        balance += newBalance;
    }
}

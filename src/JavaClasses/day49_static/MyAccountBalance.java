package JavaClasses.day49_static;

public class MyAccountBalance {
    public static void main(String[] args) {
        MyBankAccount me = new MyBankAccount();
        me.user = "Gennadiy";
        me.spend(10);
        me.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "Ivanka";
        wife.spend(30);
        wife.showBalance();

        MyBankAccount kid = new MyBankAccount();
        kid.user = "Martha";
        kid.spend(15);
        kid.showBalance();

        MyBankAccount.addToBalance(100);
        kid.showBalance();


    }
}

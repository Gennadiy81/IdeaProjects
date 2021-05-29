package JavaClasses.day46_encapsulation;

public class CapitolOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(3645583);
        acc.setBalance(234);
        acc.setAccountHolder("John Smith");
        acc.setType("Saving");
        System.out.println(acc);
    }
}

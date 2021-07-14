package JavaClasses.day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 30;
        System.out.println("Class is going out for " + minutes + " minutes");
        if (minutes > 50) {
            throw new BreakTimeException("Time for break");
        }
        int balance = 400;
        int itemPrice = 500;
        if (balance < itemPrice){
            throw new InsufficientBalanceException("Not enough money");
        }
        System.out.println("Item successfully purchased");
    }


}

package JavaClasses.day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 5000.0;

        if (salesAmount <= 2000) {
            System.out.println("Good job, you qualified for full bonus!");
            bonus = 100; //conditional value assignment
        } else {
            System.out.println("Great job, you are qualified for bonus");
            bonus = 50;
        }

        System.out.println("Your total bonus : $" + bonus);

    }
}

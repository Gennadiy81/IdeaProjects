package replit.CastomClasses;

public class Calculator {
    public static void main(String[] args) {
        LameCalculator calculatorMy = new LameCalculator();
        System.out.println(calculatorMy.plus(1, 1));
        System.out.println(calculatorMy.minus(1, 1));
        System.out.println(calculatorMy.multiply(2, 1));
        System.out.println(calculatorMy.divide(10, 2));
    }
}

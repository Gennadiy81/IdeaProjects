package JavaClasses.day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(23, 45));
        System.out.println(minus(23, 45));
        System.out.println(multiply(23, 45));
        System.out.println(divide(23, 45));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double result = num1 + num2;
        return result;

    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}

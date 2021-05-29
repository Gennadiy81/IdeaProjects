package replit.CastomClasses;

public class CalculatorTwo {
    public static void main(String[] args) {
        CalcTwo a = new CalcTwo();
        a.setX(10);
        a.setY(5);
        a.minus();
        System.out.println(a.getResult());
        a.plus();
        System.out.println(a.getResult());


    }
}

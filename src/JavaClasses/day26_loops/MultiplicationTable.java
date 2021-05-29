package JavaClasses.day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num1 = 5;
        if(num1 < 1 || num1 > 10){
            System.out.println("Invalid number");
            return;
        }
        for (int num2 = 1; num2 <= 10; num2++){
            System.out.println(num1 + " * " + num2 + " = " + num1 * num2);


        }
    }
}

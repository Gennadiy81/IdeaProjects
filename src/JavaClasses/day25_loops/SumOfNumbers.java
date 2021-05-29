package JavaClasses.day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum = 1;
        for(double i = 1; i <= 10000000; i++){
            System.out.println(i);
            sum *= i;

        }

        System.out.println("sum = " +  sum);
    }
}

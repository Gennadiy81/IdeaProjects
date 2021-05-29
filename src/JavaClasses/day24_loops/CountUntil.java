package JavaClasses.day24_loops;
import java.util.*;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until");
        double numberToStop = scan.nextDouble();
        double start = 1;
        while(numberToStop >= start){
            System.out.print(start + " ");
            start++;
        }

    }
}

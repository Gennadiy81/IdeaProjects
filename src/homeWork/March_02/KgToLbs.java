package homeWork.March_02;
import java.util.Scanner;

public class KgToLbs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter kg: ");
        double kg = in.nextDouble();
        double lbs = kg * 2.205;
        System.out.println("Total lbs:" + lbs);
    }
}

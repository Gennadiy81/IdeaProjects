package homeWork.March_01;
import java.util.Scanner;

public class literToGallonConverter {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("######## LITER TO GALLON CONVERTOR #######");
        System.out.println("Enter liters:");
        double liter = info.nextDouble();
        double gallon = 3.785 / liter;
       // double ;
        System.out.println("Gallons:" + liter);
    }
}
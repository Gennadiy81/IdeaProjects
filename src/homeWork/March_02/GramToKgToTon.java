package homeWork.March_02;
import java.util.Scanner;

public class GramToKgToTon {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Enter grams: ");
        double gram = info.nextDouble();
        double kg = gram /1000;
        double ton = gram / 1000000;
        System.out.println("Total kg: " + kg);
        System.out.println("Total ton: " + ton);



    }
}

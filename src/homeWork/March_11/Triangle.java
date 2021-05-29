package homeWork.March_11;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter triangle sides");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        //boolean check = (a + b + c) == 180;
        int sum = a + b + c;
        if (sum == 180) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Not a valid triangle");

        }
    }
}
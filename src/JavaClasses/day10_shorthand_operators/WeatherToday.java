package JavaClasses.day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String weather1 = "Sunny";
        //String weather = scan.next(); // Only one word;
        //System.out.println("Today is " + weather);
        String words = scan.nextLine();// whole sentence
        System.out.println("How is the weather today? " + words);
    }
}

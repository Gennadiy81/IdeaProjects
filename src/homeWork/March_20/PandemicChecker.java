package homeWork.March_20;
import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int year;
        year = scan.nextInt();
        if(year > 1346 && year < 1353)
            System.out.println("The Black Death");
        if(year > 1665 && year < 1666)
            System.out.println(" Great Plague of London");
        if(year > 1770 && year < 1772)
            System.out.println("Russian plague");
        if(year > 1889 && year < 1890)
            System.out.println("Flu pandemic");
        if(year == 1916)
            System.out.println("American polio epidemic");
        if(year > 1918 && year < 1920)
            System.out.println("Spanish Flu");
        if(year > 2009 && year < 2010)
            System.out.println("H1N1 Swine Flu pandemic");
        if(year > 2014 && year < 2016)
            System.out.println("TWest African Ebola epidemic");
        if(year > 2020 && year < 2021)
            System.out.println("COVID-19");
        if(year < 0 || year > 2021)
            System.out.println("Invalid year");
        else{
            System.out.println("No Pandemic");
        }
    }
}

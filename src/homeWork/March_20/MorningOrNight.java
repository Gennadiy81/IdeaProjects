package homeWork.March_20;
import java.util.Scanner;

public class MorningOrNight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hour");
        int hours = scan.nextInt();
        if(hours >= 0 && hours <= 11 ){
            System.out.println(hours + "am Morning");
        }else if(hours >= 12 && hours <= 24){
            System.out.println(hours + "pm Evening");

        }else{
            System.out.println("invalid entry");
        }
        int hours2 = scan.nextInt();
        String morningOrNight= (hours2 >= 0 && hours2 <= 11 ) || (hours >= 12 && hours <= 24) ? "Morning" : "Night";
        System.out.println(morningOrNight);
    }
}

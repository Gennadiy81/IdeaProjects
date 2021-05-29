package homeWork.March_03;
import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("User enters a time(hour in 24 hour format)");
        int time = scan.nextInt();
        if(time >= 8 && time <= 23){
            System.out.println("Open");
        }else if((time < 8 && time > 0) || (time >23 && time < 24)){
            System.out.println("Closed");
        }else{
            System.out.println("Invalid time");
        }
    }
}

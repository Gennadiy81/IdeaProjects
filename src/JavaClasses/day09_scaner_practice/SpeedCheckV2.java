package JavaClasses.day09_scaner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheSpeedLimit = currentSpeed-speedLimit;
        System.out.println("You are driving " + overTheSpeedLimit
                + "mph over the speed limit. Slow down!!!!");
    }
}

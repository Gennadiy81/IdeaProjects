package JavaClasses.day09_scaner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args){
        int speedLimit =55;
        int currentSpeed = 75;
        int overTheSpeedLimit = currentSpeed - speedLimit;
        System.out.println("Your driving " + overTheSpeedLimit +
                "mph over the speed limit. Slow down!" );

    }
}

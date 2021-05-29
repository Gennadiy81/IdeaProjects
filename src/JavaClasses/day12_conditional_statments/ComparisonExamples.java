package JavaClasses.day12_conditional_statments;

public class ComparisonExamples {
   public static void main(String[] args) {
       int currentSpeed = 45, speedLimit = 55;


       System.out.println(currentSpeed > speedLimit);
       System.out.println(speedLimit < currentSpeed);
       System.out.println(speedLimit == currentSpeed);

       boolean isSpeeding = currentSpeed > speedLimit;
       System.out.println("Are you speeding? - " + isSpeeding);

       currentSpeed += 20;////45+20 incrementing

       isSpeeding = currentSpeed > speedLimit;
       System.out.println("Are you speeding? " + isSpeeding);
       System.out.println("currentSpeed - " + currentSpeed);
       System.out.println("speedLimit " + speedLimit);


       double accountBalance = 250.25;
       double itemPrice = 100.99;
       System.out.println("can i afford? - " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance > itemPrice;
       System.out.println("Can i afford? - " + canAfford);

       accountBalance -= itemPrice;

       boolean isBroke = accountBalance <= 0;
       System.out.println("Im I broke? - " + isBroke);
       System.out.println();

       int speedLimit2 = 55, currentSpeed2 = 80;

       System.out.println(speedLimit2 == currentSpeed2);
       boolean isSpeeding2 = speedLimit2 >= currentSpeed2;
       System.out.println("Are you speeding? - " + isSpeeding2);
















   }
}

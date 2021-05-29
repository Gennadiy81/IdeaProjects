package JavaClasses.day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            System.out.println("I'm hungry. i will get something to eat");
        } else {
            System.out.println("I'm not hungry. i'll keep coding java");


        }
        double price = 130.44;
        boolean isAffordable = 200 >= price;
        System.out.println("isAffordable = " + isAffordable);

        if (isAffordable) {
            System.out.println("All good");

        } else {
            System.out.println("All bad");
        }

        boolean isRemoteJob = false;
        if(!isRemoteJob){
            System.out.println("Sorry I am not interested");

        }else{
            System.out.println("Sure I am interested , what is interview process?");
        }









    }
}
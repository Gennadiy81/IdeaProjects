package JavaClasses.day12_conditional_statments;

public class IfElseStatement {
    public static  void main(String[] args) {
        if (10 > 5) {
            System.out.println("CONDITION IS TRUE");

        } else {
            System.out.println("CONDITION IS FALSE");
        }

        int count = 25;
        if (count > 30) {//false
            System.out.println("Count more than 30");
        } else {
            System.out.println("Count lest than 30");
        }
        byte age = 14;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is grater or equal to 18");

        } else {
            System.out.println("Not Eligible to vote");
            System.out.println("Age is less than 18");
        }


    }
    }
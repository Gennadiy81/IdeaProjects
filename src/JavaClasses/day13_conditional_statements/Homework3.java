package JavaClasses.day13_conditional_statements;

public class Homework3 {
    public static void main(String [] args){
        double bonus;
        double saleAmount = 1000;
        if (saleAmount >= 2000){
            bonus = 50;
            System.out.println("You ar eligible");
        }else{
            bonus = 100;
            System.out.println("Yor are eligible");
        }
        System.out.println("for bonus of $" + bonus);

    }
}

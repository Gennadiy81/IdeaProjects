package JavaClasses.day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount - " + myCoffee.getAmount);
        myCoffee.refill();
        System.out.println("Amount after refill = " + myCoffee.getAmount);
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount);
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee - " + myCoffee);
        System.out.println(myCoffee.toString());
        Coffee coffee1 =  new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("espresso");
        Coffee coffee3 = new Coffee();
        coffee3.setType("frappucino");
        coffee3 = coffee2;
        System.out.println("coffee3 = " + coffee3.getType());
        Coffee coffee4 = null;
        //coffee4.setType("turkish");





    }
}

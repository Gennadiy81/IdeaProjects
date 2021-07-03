package JavaClasses.day58_polymorphysm;

public class Amazon extends OnlineShopping implements Prime{

    @Override
    public void primeShipping() {

    }

    @Override
    public void buy() {
        System.out.println("Buy on Amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Sell on Amazon.com");

    }

    @Override
    public void ship() {

    }
}

package JavaClasses.day51_inheritance_method_overriding;

public class LiftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LiftXL lyftXlRide = new LiftXL();
        Lux luxRide = new Lux();
        System.out.println("luxRide.calculateRate(5) = " + luxRide.calculateRate(5));
        System.out.println("lyftXlRide = " + lyftXlRide.calculateRate(5));
        System.out.println("luxRide.calculateRate(5) = " + lyftRide.calculateRate(5));
    }

}

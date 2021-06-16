package JavaClasses.day54_adstraction;

public class Salad extends MenuItem{

    @Override
    public void prepare() {
        System.out.println("Chop veggies, add dressing");
    }

    @Override
    public void serve() {
        System.out.println("Putt on the plate");

    }
}

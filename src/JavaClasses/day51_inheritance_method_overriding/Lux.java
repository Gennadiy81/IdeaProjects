package JavaClasses.day51_inheritance_method_overriding;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) * 1.2;
    }
}

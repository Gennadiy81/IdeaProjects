package JavaClasses.day51_inheritance_method_overriding;

public class Contractor extends Employee{
    @Override
    public double calculateSalary(double hourlyRate){
        return (2080 - 80) *hourlyRate;
    }
}

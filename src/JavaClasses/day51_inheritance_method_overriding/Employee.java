package JavaClasses.day51_inheritance_method_overriding;

public class Employee extends  Object{
    String jobTitle;

    public double calculateSalary(double hourlyRate){
        return hourlyRate * 2080 + (hourlyRate * 2080 / 100 * 10);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

}

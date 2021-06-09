package JavaClasses.day51_inheritance_method_overriding;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary =(developer.calculateSalary(61.0));
        System.out.println("annualDevSalary = " + annualDevSalary);

        Contractor sdetContractor = new Contractor();
        double sdetSalary = sdetContractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);
        sdetContractor.toString();

        developer.jobTitle = "Java developer";
        sdetContractor.jobTitle = "SDET";
        System.out.println("developer.toString() = " + developer.toString());
        System.out.println("sdetContractor = " + sdetContractor);
        System.out.println("sdetContractor.getClass() = " + sdetContractor.getClass());

    }
}

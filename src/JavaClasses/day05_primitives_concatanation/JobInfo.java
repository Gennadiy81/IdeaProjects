package JavaClasses.day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Driver";
        String company = "KYS Express";
        String jobTitle = "Truck driver";
        double salary = 85000;
        byte yearsExp = 9;
        boolean hasBenefits = false;
        System.out.println("Title: " +title);
        System.out.println("Company: " + company);
        System.out.println("Job description: " + jobTitle);
        System.out.println("Salary: " + "$" + salary);
        System.out.println("Years of experience: "+ yearsExp + "Years");
        System.out.println("Does it has benefits? " + hasBenefits);
    }
}

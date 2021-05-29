package JavaClasses.day15_logical_swith_ternery;

public class JobOfferSelector {
    public static void main(String[] args) {
        String locationNear = "Chicago";
        double salaryGood = 80_000.0;
        boolean remoteJob = true, hasBenefits = true;
        if(locationNear.equals("Chicago") && salaryGood >= 80_000 && remoteJob && hasBenefits){
            System.out.println("Accept the jod");
        }else{
            System.out.println("Reject the job");
        }
    }
}

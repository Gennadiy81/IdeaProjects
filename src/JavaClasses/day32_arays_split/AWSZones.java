package JavaClasses.day32_arays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("----- Starting deployment of etsy app to AWS zones -----");
        String[] splitZones = zones.split(",");
        for (String each : splitZones){
            System.out.println("Deploying [" +app+ "] to " + each + "...");
        }
        System.out.println("All zones complete");




    }
}
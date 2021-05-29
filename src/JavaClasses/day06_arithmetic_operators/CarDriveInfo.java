package JavaClasses.day06_arithmetic_operators;

public class CarDriveInfo {
    public static void main(String[] args){
        String carModel = "Toyota Tacoma";
        String driverName = "Gennadiy";
        String driverLicense = "S12345678";
        byte speed = 55;
        boolean automaticTransmission = false;
        char licenseClass = 'A';
       System.out.println("What is the car number?:" + carModel);
       System.out.println("What in the driver name?:" + driverName);
        System.out.println("What is the speed?:" + speed+"MPH");
        System.out.println("Is the transmission automatic?:" + automaticTransmission);
        System.out.println("What is the driver license class?:" + licenseClass);
        System.out.println(driverName +" is driving " + carModel);

        System.out.println("Current speed : " + speed + "MPH");

        // boolean with (byte,short,int,long)  doesnt work; need String
       // System.out.println(speed + automaticTransmission);


    }
}

package JavaClasses.day53_inheritance.tasla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Y", "Tesla", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        System.out.println("ec1 make - " + ec1.getMake());
        System.out.println("ec1 Model = " + ec1.getModel());
        System.out.println("ec1 Price = " + ec1.getPrice());
        System.out.println("ec1 Year = " + ec1.getYear());
        System.out.println("ec1 Range = " + ec1.getRange());

        if (ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() +" - "+ec1.getModel() +" is out of my budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Cybertruck", "Tesla", 59990.0, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count " + ElectricCar.getCount());
       //System.out.println("Count = " + ec2.getCount);

        Roadster roadster = new Roadster("Roadster", "Tesla", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        System.out.println("Total miles for Roadster - " + roadster.getRange());
        roadster.drive(600);
        System.out.println("Total miles for Roadster - " + roadster.getRange());
        System.out.println(roadster.getCount());

        ModelX modelX = new ModelX("Model X", "Tesla", 89999.0, 2021, 360);
        modelX.drive(10);
        System.out.println(modelX.getRange());
        modelX.drive(10);
        System.out.println("Range remaining - " + modelX.getRange());
        System.out.println("Total " + ElectricCar.getCount());



    }
}

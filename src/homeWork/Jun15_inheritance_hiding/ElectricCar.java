package homeWork.Jun15_inheritance_hiding;

public class ElectricCar extends Car {
    String electricCar = "Using electricity";
    public static void use(){
        System.out.println("Drives on electricity");

    }
    public void electric(){
        use();
        System.out.println("Drives quietly");
    }


}

package homeWork.Jun15_inheritance_hiding;

public class Car {
    String car = "Car is driving";

    public static void use(){
        System.out.println("Getting power from");
    }
    public void drive(){
        use();
        System.out.println("Drive on");
    }
     static{
        System.out.println("My car");
    }
}

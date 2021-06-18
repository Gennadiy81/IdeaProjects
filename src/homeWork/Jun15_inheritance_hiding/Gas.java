package homeWork.Jun15_inheritance_hiding;

public class Gas extends Car {
    String gasCar = "Using gas";
    public static void use(){
        System.out.println("Drives on gas");
    }

    public void gas(){
        use();
        System.out.println("Drives loud");
    }
}

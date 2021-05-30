package homeWork.May_29_Constructor_Static;

public class CarObject {
    public static void main(String[] args) {
        MyCar carOwner = new MyCar();
        carOwner.setAge(25);
        carOwner.setCylinders(6);
        carOwner.setModel("Toyota");
        carOwner.setColor("Gray");
        MyCar.myCarNice(3000, true);
        System.out.println(carOwner);
        carOwner.setOldModels("Honda");
        carOwner.setOldModels("Toyota");
        carOwner.setOldModels("Ford");
        System.out.println(carOwner.myOldModels());








    }
}

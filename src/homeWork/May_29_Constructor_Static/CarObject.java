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

        MyCar carOwnerTwo = new MyCar();

        carOwnerTwo.setOldModels("Pontiac");
        carOwnerTwo.setOldModels("Nisan");
        carOwnerTwo.setOldModels("Infinity");

        System.out.println("------ Second owner ------");

        System.out.println(carOwnerTwo.myOldModels());
        carOwnerTwo.setModel("Ford");
        carOwnerTwo.setColor("White");
        carOwnerTwo.setCylinders(6);
        carOwnerTwo.setAge(27);

        MyCar.myCarNice(37, false);

        System.out.println(carOwnerTwo.getModel() + " "
                + carOwnerTwo.getColor() + " " + carOwnerTwo.getAge() + " "
                + carOwnerTwo.getCylinders());









    }
}

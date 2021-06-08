package homeWork.Jun_06;

public class CarObject {
    public static void main(String[] args) {
        MyNewCar niceCar1 = new MyNewCar();
        niceCar1.carName = "Pontiac GTO";
        niceCar1.brandNew = "New car";
        System.out.println(niceCar1.brandNew);
        System.out.println(niceCar1);
        System.out.println("Car.carIsRunning() = " + Car.carIsRunning());
        Car.tires = 4;
        niceCar1.tireBroke(1);

        niceCar1.color= "Orange";
        System.out.println("Car.carIsRunning() = " + Car.carIsRunning());
        niceCar1.setNickName("Hula hula");
        niceCar1.getNickName();
        niceCar1.model  = "Ford";
        niceCar1.setNickName("");
        System.out.println(niceCar1);
        niceCar1.oldOrNew("Very new");





    }
}

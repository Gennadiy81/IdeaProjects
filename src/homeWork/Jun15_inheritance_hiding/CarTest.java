package homeWork.Jun15_inheritance_hiding;

public class CarTest {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        System.out.println("electricCar.electricCar = " + electricCar.electricCar);
       electricCar.electric();
       electricCar.drive();

       Gas gas = new Gas();
        System.out.println("gas.car = " + gas.car);
        gas.drive();
        gas.gas();
    }
}

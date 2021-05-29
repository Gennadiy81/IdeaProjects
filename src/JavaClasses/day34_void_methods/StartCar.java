package JavaClasses.day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        presGasPedal();
    }
    public static void presGasPedal(){
        System.out.println("4. Hold steering wheel with two hands and press gas pedal");
    }
    public static void seatInCar() {
        System.out.println("1. Open the door and seat in driver seat");
    }
    public static void startTheCar() {
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3. Press break pedal and shift to 'D");
    }
}

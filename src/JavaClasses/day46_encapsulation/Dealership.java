package JavaClasses.day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMadel("nisan");
        System.out.println(car1.getMadel());
        car1.setYear(2020);
        System.out.println("car year = " + car1.getYear());
        car1.setMileage(10005);
        System.out.println("car mileage =  " + car1.getMileage());
        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setMadel("Alfa romeo Julia");
        alfaRomeo.setMileage(10010);
        alfaRomeo.setYear(2020);
        System.out.println("car - " + car1.getMadel());
        System.out.println("car mileage - " + car1.getMileage());
        System.out.println("car year - " + car1.getYear());
        System.out.println(car1.toString());

    }
}

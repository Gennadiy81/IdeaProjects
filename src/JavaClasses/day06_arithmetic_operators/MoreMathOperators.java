package JavaClasses.day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 15;
        int totalCarsInParking = toyotas + hondas + vw + tesla + nissan + bmw;
        System.out.println(toyotas + hondas + vw + tesla + nissan + bmw);
        System.out.println("There are " + totalCarsInParking + " in parking lot");


        String pizza = "hawaiin";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        System.out.println("The are " + slicesPerPerson + " slices per person");
        System.out.println("We ordered " + pizza + " with " + slices +" slices, "
                + people + " people " + " ate " + slices/people + " slices each");
    }
}

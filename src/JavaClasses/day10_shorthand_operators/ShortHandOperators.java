package JavaClasses.day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("Cars in parking lot " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        // six cars left
        cars -= 6;
        System.out.println("cars in the parking lot = " + cars);
        cars -= 1;
        System.out.println("cars in the parking lot = " + cars);
         int electricCar = 13;
         cars =+ electricCar;
        System.out.println("cars in parking lot = " + cars);

        String word = " Java ";
        System.out.println(" world = " + word);
        word = word + " programing ";
        System.out.println(" word = " + word);
        word += " is fun ";
        System.out.println("word = " + word);

        String selenium = " but selenium more fun. ";
        System.out.println("selenium = " + selenium);
        word += selenium;
        System.out.println("word = " + word);
        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter  " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        // add latter '1' to letter
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 percent off
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);
        // weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);









    }
}

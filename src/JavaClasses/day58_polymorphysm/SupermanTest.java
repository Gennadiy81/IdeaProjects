package JavaClasses.day58_polymorphysm;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.feesKins();
        spMan1.playingWithKids();
        spMan1.raiseKids();

        Worker spMan2 = new Superman();
        spMan2.getPaid();
        spMan2.work("SDET");
        System.out.println("got paid $" + spMan2.getPaid());

        Superman spMan3 = new Superman();
        spMan3.getPaid();
        spMan3.work("Scram Master");
        spMan3.feesKins();
        spMan3.playingWithKids();
        spMan3.raiseKids();



    }
}

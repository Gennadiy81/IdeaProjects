package JavaClasses.day58_polymorphysm;

public class Casting {
    public static void main(String[] args) {

        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKids();
        ((Superman)worker).playingWithKids();

        Superman superman = (Superman) worker;
        worker.work("Super father");
    }
}

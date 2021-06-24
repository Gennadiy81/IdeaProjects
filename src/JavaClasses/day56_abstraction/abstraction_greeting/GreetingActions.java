package JavaClasses.day56_abstraction.abstraction_greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.buy();
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.buy();
        gt = new Japanese();
        gt.buy();
        gt.hi();

    }
}

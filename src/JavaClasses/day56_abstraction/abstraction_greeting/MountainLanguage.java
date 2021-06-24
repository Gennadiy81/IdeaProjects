package JavaClasses.day56_abstraction.abstraction_greeting;

public class MountainLanguage implements Greeting {
    @Override
    public void hi() {
        System.out.println("Zeee");
    }

    @Override
    public void buy() {
        System.out.println("Buooa");
    }
}

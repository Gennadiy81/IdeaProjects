package JavaClasses.day56_abstraction.abstraction_greeting;

public class Japanese implements Greeting {
    @Override
    public void hi() {
        System.out.println("Hi Japanese");
    }

    @Override
    public void buy() {
        System.out.println("Buy Japanese");
    }
}

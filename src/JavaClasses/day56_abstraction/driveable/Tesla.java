package JavaClasses.day56_abstraction.driveable;

import JavaClasses.day56_abstraction.abstraction_greeting.Greeting;

public class Tesla extends Transportation implements SelfDriveable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost " + (mile * 0.10) + " to drive " + mile + " miles");
    }

    @Override
    public void autoPiloting() {

    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying 'hello hello");
    }

    @Override
    public void buy() {
        System.out.println("Buy buy");
    }
}

package JavaClasses.day56_abstraction.driveable;


import JavaClasses.day56_abstraction.abstraction_greeting.Greeting;
import JavaClasses.day56_abstraction.driveable.SelfDriveable;
import JavaClasses.day56_abstraction.driveable.Transportation;


public class Plane extends Transportation implements SelfDriveable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile * 25.0) + " to fly " + mile + " miles");

    }

    @Override
    public void hi() {
        System.out.println("Welcome ");
    }

    @Override
    public void buy() {

    }

    public void land() {
    }
}

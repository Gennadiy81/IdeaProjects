package JavaClasses.day56_abstraction.driveable;

public interface SelfDriveable {
    void autoPiloting();
    public default void selfPark(){
        System.out.println("Performing self park steps");
    }
    
}

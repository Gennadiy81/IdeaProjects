package JavaClasses.day49_static;

public class StaticTest{
    public static void main(String[] args) {
        StaticMethods.displayMessage("Wooden spoon");

        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();
    }
}

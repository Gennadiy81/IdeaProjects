package JavaClasses.day57_abstraction_polimorphism.abstract__class_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final  String LANGUAGE = "java";

    public AbstractA(){
        System.out.println("Abstract constructor");
    }

    public abstract void absMethod();
    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethod(){
        System.out.println("static method is called");
    }
}

package JavaClasses.day57_abstraction_polimorphism.abstract__class_vs_interface;

public interface InterfaceA {

    static final String TYPE = "interface";
    double MAX_COUNT = 500;
    public abstract void absMethodD(int num);
    public static void staticMethodE(String str){
        System.out.println("staticMethodE id called with str - " + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethod is called");
    }
}

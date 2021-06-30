package JavaClasses.day57_abstraction_polimorphism.abstract__class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{

    @Override
    public void absMethod() {
        System.out.println("absMethod implementation is called");
    }
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }
    public void absMethodD(int num){

    }
}

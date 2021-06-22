package JavaClasses.day54_adstraction;

public abstract class MeWorking {
    String a = "Hola";
    public void student(){
        System.out.println("Hello student");
    }

}
class Child extends MeWorking{
    public void student(){
        System.out.println(a);
       // super.student();

    }

}
class MyHardWork{
    public static void main(String[] args) {
        Child n = new Child();
        String adg = n.a;
        n.student();
    }
}

package JavaClasses.day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args){
        StaticBlockDemo st1 = new StaticBlockDemo();
        StaticBlockDemo st12 = new StaticBlockDemo();
        StaticBlockDemo st13 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);
        System.out.println(StaticBlockDemo.carModels);

    }
}

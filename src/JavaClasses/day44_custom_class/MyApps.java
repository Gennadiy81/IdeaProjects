package JavaClasses.day44_custom_class;

public class MyApps {
    public static void main(String[] args) {
        App app1 = new App();
        app1.version = 2.4;
        app1.name = "uber";
       app1.open();

        app1.version = 8.0;
        app1.open();

    }
}

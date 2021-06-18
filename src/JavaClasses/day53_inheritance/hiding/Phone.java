package JavaClasses.day53_inheritance.hiding;

public class Phone {
    String type = "Old school phone";

    public static void use (){
        System.out.println("Using the Phone Parent");
    }

    public void call(){
        use();
        System.out.println("and making a phone call Parent");
    }
}

package JavaClasses.day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";

    public static void use(){
        System.out.println("Using mobile phone Child");
    }

    public void text(){
        use();
        System.out.println("and sending a text message Child");
    }
    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile Child");
    }
}

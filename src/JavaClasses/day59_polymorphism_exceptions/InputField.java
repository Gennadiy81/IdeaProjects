package JavaClasses.day59_polymorphism_exceptions;

public class InputField implements WebElement{
    public static final String TAG_NAME = "input";
     public String gitValue(){
         System.out.println("Getting value in the InputField");
         return "selenium";
     }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing input field " + txt);
    }

    @Override
    public void click() {
        System.out.println("");

    }

    @Override
    public String getText() {
        System.out.println("getting text of input field");
        return "java";
    }
}

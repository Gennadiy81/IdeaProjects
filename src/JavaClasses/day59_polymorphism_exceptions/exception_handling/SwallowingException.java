package JavaClasses.day59_polymorphism_exceptions.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(5/0);

        }catch (Exception ignore){}
        System.out.println("How are you today?");
        System.out.println("We just suppressed / swallowed the Runtime Exception");
    }
}

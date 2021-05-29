package JavaClasses.day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        int count = 15;
        displayValue(count);
        greetByName("Gennadiy");
        String name = "Ivannka";
        greetByName(name);
    }

    public static void displayValue(int num){
        System.out.println("Value is - " + num);

        }
        public static void greetByName(String name){
            System.out.println("Hello " + name + ", how are you doing today");
        }
    }

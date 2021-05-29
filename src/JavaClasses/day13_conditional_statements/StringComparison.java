package JavaClasses.day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")){ // space sensitive
            System.out.println("It is LA");
        }else{
            System.out.println("It is not LA");
        }

        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("Lets go out and java!");
        }else{
            System.out.println("Lets go out and code java!");
        }
    }
}

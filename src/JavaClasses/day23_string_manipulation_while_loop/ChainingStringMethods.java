package JavaClasses.day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "Wooden Spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ", ""). toUpperCase());

        String city = "cHiCaGo";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

    //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

}
}

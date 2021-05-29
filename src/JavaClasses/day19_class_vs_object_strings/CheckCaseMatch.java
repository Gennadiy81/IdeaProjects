package JavaClasses.day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String country = "USA";
        if(country.equals(country.toUpperCase())){
            System.out.println("in upper case");
        }else {
            System.out.println("lower case");
        }
    }
}

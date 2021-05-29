package JavaClasses.day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {

        buildEmail("genn adiy", "gmail");
    }
    public static void buildEmail(String name, String domain){
        name =  name.toLowerCase().replace(" ","_");
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);
    }
}

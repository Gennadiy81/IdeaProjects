package replit.Strings;
import java.util.*;
public class EmailOneAndTwo {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

       // if(email.contains("_")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lestName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        String firstName1 = email.substring(1, email.indexOf("_"));
        String lestName2 = email.substring(email.indexOf("_")+2, email.indexOf("@"));

        String firstLetter = "" + firstName.toUpperCase().charAt(0);
        String firstLetter1 = "" + lestName.toUpperCase().charAt(0);

        System.out.println("First name: " + firstLetter + firstName1);
        System.out.println("Last name: " +   firstLetter1 + lestName2);
        System.out.println("Domain: " + domain);


    }
}

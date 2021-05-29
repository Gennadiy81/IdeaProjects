package replit.May_30;

public class Email {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";
        if (email.contains("_")){
           // String firstName = email.replace("mike", "tyson").replace("tyson", "mike");
           // String lestName = email.replace( email.replace("mike", "tyson").replace("tyson", "mike"));.replace("tyson", "mike"));
            String firstName = email.replace( "mike","tyson");
        }
    }
}

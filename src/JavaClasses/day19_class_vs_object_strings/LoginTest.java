package JavaClasses.day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
       String expUserName = "CYBERTEK";
       String password = "Abc123";
       if(expUserName.equalsIgnoreCase("CYBERTEK") && password.equals("Abc123")){
           System.out.println("Pass - user successfully logged in");
       }else{
           if(!expUserName.equalsIgnoreCase("CYBERTEK")){
               System.out.println("Incorrect Username");
           }else {
               System.out.println( "Incorrect password");
           }
       }
    }
}

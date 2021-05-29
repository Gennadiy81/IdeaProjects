package homeWork.March_22;

public class PasswordVerification {
    public static void main(String[] args){
        String userName = "Ghena";
        String password = "Java123";
        if(password.length() < 5) {
            System.out.println("Password cannot be less than 5 characters");
        }else if(password.contains(userName)){
                System.out.println( "Invalid password, username should not be in it");
        }else{
            System.out.println("Valid password: " + password.replace("Java123", "password"));
        }




    }
}

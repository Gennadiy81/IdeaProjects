package JavaClasses.day37_methods_overloading;

public class WarmUp {
    public static void main(String[] args) {
        loginVoid ("cybertekStudent","abs123");
        loginVoid("myName", "i forgot");
        //System.out.println(loginValid("cybertekStudent","abs123")); error - void - no return value
        System.out.println(login("cybertekStudent","abs123"));
        if (login("cybertekStudent","abs123") == true){
            System.out.println("Login successful");
        }else{
            System.out.println("Login unsuccessful");
        }
        boolean isLoginSuccessful = login("nadir","mountain");
        System.out.println(isLoginSuccessful + " - Login is unsuccessful");


    }
    public static void loginVoid (String username, String password){
        String secretUsername ="cybertekStudent", secretPassword = "abs123";
        if (secretUsername.equalsIgnoreCase(username) && secretPassword.equalsIgnoreCase(password)){
            System.out.println("Login Successful, welcome cybertekStudent");
        }else{
            System.out.println("Incorrect username or password");

        }
    }
    public static boolean login (String userName, String password){
        String secretUsername ="cybertekStudent", secretPassword = "abs123";
         return (secretUsername.equalsIgnoreCase(userName) && secretPassword.equalsIgnoreCase(password));

        }

    }



package JavaClasses.day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {
       int expLast4SSN= 1234;
        int expPinCode = 5321;

        int last4SSN = 1234;
        int pinCode = 4321;


        if(expLast4SSN == last4SSN && expPinCode == pinCode){
            System.out.println("Authentication successful");
        }else {
            System.out.println("Authentication unsuccessful");
            if(expLast4SSN != last4SSN){
                System.out.println( "Last 4 of SSN did not match");
            }

            if(expPinCode != pinCode){
                System.out.println("Pin code did not match");
            }
        }

    }
}

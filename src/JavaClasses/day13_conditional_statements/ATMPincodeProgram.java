package JavaClasses.day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {


        int inputPincode = 2544;
        int secretPincode = 2345;
        if(inputPincode == secretPincode){
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");


        }else{
            System.out.println("Incorrect pincode ");
            System.out.println("Please try again");
        }
        System.out.println("Thank you for using TD Bank ATM!");
    }
}

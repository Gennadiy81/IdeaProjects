package JavaClasses.day04_varaibles_intro;
import java.util.Scanner;

public class AmazonItem {
    public static void main(String[] args){
        //Enter your code here
        String firstName = "James", lastName = "Mey", fullName = "Mey, Jams", email = "jamesmay@gmail.com", street = "7925 Jones Branch Dr,", state = " VA ", city = " McLean, ",
                address = "Address: ", contacts = "Contacts: ";

        int age = 35, zipcode = 22102;
        double height = 5.10, weight = 173.2;
        boolean isMarried = true;
        long workPhoneNumber = 7896542314L, personalPhoneNumber = 2406542314L;

        Scanner scan = new Scanner(System.in);


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println(address + street + city + state + zipcode);
        System.out.println(contacts + " work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married?: " + isMarried);

    }
}

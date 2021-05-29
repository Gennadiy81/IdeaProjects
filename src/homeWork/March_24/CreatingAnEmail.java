package homeWork.March_24;
import java.util.Scanner;
public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings");
         //String word1 = scan.nextLine();
        // String word2 = scan.next();
        String word1 = "Ghenna", word2 = "Ivanka" , email ="";


        if(word1.length() >= 6 && word2.length() >= 6){
            email = word1.substring(0, 4);
            email =email + word2.substring(word2.length()-3);
            email += "@cybertec.com";
            System.out.println(email);
        }else{
            System.out.println("Invalid data");
        }

    }
}

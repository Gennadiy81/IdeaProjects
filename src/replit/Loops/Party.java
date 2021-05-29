package replit.Loops;
import java.util.*;
public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name1 = input.next();
        String nameList = ", ";
        String newGuest = "";
        do {
            System.out.println("Do you want to enter new guest name:");
            newGuest = input.next();
            if(newGuest.equals("yes")){
                System.out.println("Please enter guest name:");
               String name = input.next();
                nameList += name + ", ";
            }else{
                break;
            }
            }while(newGuest.equals("yes"));
        System.out.println("Guest's list: " + name1 + nameList);


            }
        }




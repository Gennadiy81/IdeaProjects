package replit.Loops;
import java.util.*;
public class Zombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        if (inhabitants ==0){
            System.out.println("---- EXTINCT ----");
            return;
        }
        int days= 0;
        System.out.println("Day "+ days+ " " + "[" + inhabitants  + "]");
        inhabitants/=2;
        for (int i = inhabitants;  i >= 1; i/=2) {
            if(days < inhabitants){
                days +=1;
                System.out.println("Day "+ days+ " " + "[" + i  + "]");

            }
        }
        System.out.println("---- EXTINCT ----");
    }
}



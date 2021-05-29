package homeWork.March_11;
import java.util.Scanner;

public class RetakeGrate {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter attempt");
        int attempt = scan.nextInt();
        if(attempt == 1){
            System.out.println("Score " + (100 - 100 * 0.1) +  "%");
        }else if(attempt == 2){
            System.out.println("Score " + (100 - 100 * 0.2) + "%");
        }else if(attempt == 3){
            System.out.println("Score " + (100 - 100 * 0.35) + "%");



        }
    }
}



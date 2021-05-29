package JavaClasses.day25_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
       int end = scan.nextInt();
       // int start = 5;
       // int end = 10;
        if (start > end){
            System.out.println("Revers numbers are not supported");
        }

        for(int n = start; n <= end; n++ ){
            System.out.println(n + " ");
        }

    }
}

package replit.Arrays;
import java.util.*;
public class PrintingOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[2];
        for (int i=0;i<2;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for(int n = 0; n < arr.length; n++){
            System.out.println(arr[n].substring(0,3));
        }
    }
}

package replit.Methods;
import java.util.*;
public class MethodsWithReturnMax {
    public static int max(int x, int max) {

        // Code here
        if(x > max){
            System.out.println(x);
        }else if(max > x){
            System.out.println(max);
        }else{
            System.out.println(x);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


}


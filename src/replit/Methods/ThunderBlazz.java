package replit.Methods;
import java.util.*;
public class ThunderBlazz {
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3){
        // your code here
        if (available == true || gift == true || ingredient1 + ingredient2 + ingredient3 == 6){
            return true;
        }else{

        }
        return false;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}

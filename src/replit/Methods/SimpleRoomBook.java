package replit.Methods;
import java.util.*;
public class SimpleRoomBook {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here
        boolean room = true;
        if(isAvailable == true && year == 2018 && day <=30 && day > 0
                && month != 7){
            room = true;
        }else{
            room = false;
        }
        return room;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}

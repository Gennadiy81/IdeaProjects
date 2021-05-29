package replit.Methods;
import java.util.*;
public class SwitchElements {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));
        System.out.println(Arrays.toString(arr));
    }


    public static int[] do_switch(int[] i) {
        int temp = i[i.length-1];
         i[i.length-1] = i[0];
        i[0] = temp;
        int []arr = i;
        return arr;
    }

}




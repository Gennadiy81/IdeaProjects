package replit.Arrays;

import java.util.Arrays;

public class ZombieAttack {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        int[] arr = new int[inhabitants.length];
        int days = 0;
        int j = 0;
        System.out.println(Arrays.toString(inhabitants));

        for (int i = 0; i < inhabitants.length; i++) {
            System.out.print("[");
            days = 0;
           // for (int k = 0; k < inhabitants.length; k++) {
            for (int each : inhabitants){
                inhabitants[j] = each/2;
                System.out.print(each/2+", ");

            }
            System.out.println("]");
        }
    }
}

          


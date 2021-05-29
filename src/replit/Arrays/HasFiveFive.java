package replit.Arrays;

import java.util.Arrays;

public class HasFiveFive {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 5};
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 5)
                num = 0;
            if (nums[i] == 5) {
                num++;
                if (num == 2) {
                    break;
                }
            }
        }
        if (num == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}






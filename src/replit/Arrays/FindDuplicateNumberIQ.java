package replit.Arrays;

import java.util.Arrays;

public class FindDuplicateNumberIQ {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        int count = 0;
        String str = "";
        String str2;
        Arrays.sort(nums);
        for (int i = 0;  i < nums.length-1; i++){
             for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    ++count;
                    System.out.println(nums[j]);
                    str += "" + nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}




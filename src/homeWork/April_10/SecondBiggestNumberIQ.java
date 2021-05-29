package homeWork.April_10;
import java.util.*;
public class SecondBiggestNumberIQ {
    public static void main(String[] args) {
        int[] nums = {4, 3, 4, 5, 2, 8, 8};
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == nums[nums.length-1]){
                count++;
        }
        }
        System.out.println(nums[nums.length-1- count]);


                }

            }













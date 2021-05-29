package replit.Arrays;

import java.util.*;

public class ShiftLeft {
    public static void main(String[] args) {

        int []nums ={6, 2, 5, 3};
                  //[2, 5, 3, 6]
        int temp2 = 0;
            String shiftTo = "";

            for (int i = nums.length-1; i >= 0 ; i--) {
                nums[nums.length-i--] = nums[nums.length-i];




                }
        System.out.println(Arrays.toString(nums));


                }
            }

 //  Scanner scan = new Scanner(System.in);
//       // int size = scan.nextInt();
//       // int[] nums = new int[size];
//      //  for (int i = 0; i < size; i++) {
//       //     nums[i] = scan.nextInt();


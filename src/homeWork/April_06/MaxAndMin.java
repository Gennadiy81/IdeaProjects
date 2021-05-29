package homeWork.April_06;
import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        int[] num = {8120, 33, -11, 836, 4687};
        int maxNum = num[0];
        int minNum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (maxNum < num[i])
                maxNum = num[i];

            if (num[i] < minNum)
                minNum = num[i];

        }
        System.out.println("Maximum number = " + maxNum);
        System.out.println("Mim number - " + minNum);
    }
}
//} // Here we are getting a dynamic array from the user by asking for the numbers
//    //        int [] nums = {4,1,3,12,5}; -> hardcoded array
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many numbers do you have");
//        int [] nums = new int[input.nextInt()]; // 0 0 0 0 0
//
//        for(int i=0; i < nums.length; i++) {
//            System.out.println("Enter number " + (i+1));
//            nums[i] = input.nextInt();
//        }
//
//        // We are counting the number of even and odd values from that array
//
//        int even = 0;
//        int odd = 0;
//        // String even += num + " " split by space -> String []
//        for(int eachNum : nums) {
//            if(eachNum % 2 == 0){  // checks odd: eachNum % 2 != 0 or eachNum % 2 == 1
//                even++;
//            } else {
//                odd++;
//            }
//        }
//
//        // Used the counters of even and odd to make new arrays to store the values
//
//        int [] evenNumbers = new int[even];
//        int [] oddNumbers = new int[odd];
//
//        // Here we go through ever element, checks if its even or odd.
//        // Then it will store the number into the even or odd array
//        // This storage is based on the e and o variables
//
//        /*
//                i -> keep track of the indexes in your nums array
//                e -> keep track of the indexes in our evenNumbers array
//                o -> keep tracks of the indexes in our oddNumbers array
//         */
//
//        for(int i = 0, e = 0, o = 0; i < nums.length; i++) {
//            if(nums[i] % 2 == 0){
//                evenNumbers[e++] = nums[i]; // 1
//            } else {
//                oddNumbers[o++] = nums[i];
//            }
//        }
//
//        // Print the final arrays of even and odd numbers
//
//        System.out.println("Even array: " + Arrays.toString(evenNumbers));
//        System.out.println("Odd array: " + Arrays.toString(oddNumbers));

package replit.Arrays;
import java.sql.SQLOutput;
import java.util.*;
public class MakeLest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
       // int n = 0;
      //  if (size == 0){
          //  System.out.println(size + ", " + n);

      //  }else{
            String word = "";
           do {


               size--;
               System.out.print("0, ");
            }while(size*2 >= 0);

            System.out.println(nums[nums.length-1]);

        }

    }
   //     }
/*

            for (int n = j; n < size; n ++){
                System.out.println(j);
  if (size <= 2){
            System.out.println(nums[0] + ", " + nums[nums.length -1]);

        }else if (size > 2){
            for (int j = 0; j < size; j++){

            }
            System.out.print(nums[0] + ", " + nums[1] + );

 */






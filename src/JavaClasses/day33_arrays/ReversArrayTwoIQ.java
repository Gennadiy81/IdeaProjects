package JavaClasses.day33_arrays;

import java.util.Arrays;

public class ReversArrayTwoIQ {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int tamp = num1;
        num1 = num2;
        num2 = tamp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();
        int nums [] = {5, 10, 4, 100};
        int temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println("First and last swap - " + Arrays.toString(nums));


        System.out.println();

        int[] nums2 =  {5, 10, 4, 100};
        for (int i = 0; i < nums2.length/2; i++){
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length-1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }
        System.out.println("After reversing - " + Arrays.toString(nums2));

        System.out.println();

        String[] words = {"java", "html", "js", "ruby", "css"};
            System.out.println("Before reversing words - " + Arrays.toString(words));
            for (int i = 0, j = words.length-1; i <words.length/2;  i++, j --){
                String tempWords = words[i];
                words[i] = words[j];
                words[j] = tempWords;

            }
            System.out.println("Reversed words - " + Arrays.toString(words));
        }

        }





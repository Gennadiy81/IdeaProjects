package JavaClasses.day38_methods;

import java.util.Arrays;

public class ArraysUtil {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static boolean contains(int[] nums, int num) {
        for (int each : nums) {
            if (num == each) {
                return true;
            } else {
            }
        }
        return false;
    }
}


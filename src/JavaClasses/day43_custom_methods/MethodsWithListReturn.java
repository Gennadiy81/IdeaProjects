package JavaClasses.day43_custom_methods;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<Integer> mlnNums =  getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));
       // System.out.println(mlnNums);
        long st = System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en -st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = " + seconds);

    }
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            nums.add(i);
        }
        return nums;
    }
    public static int[] getIntegerArray(){
        int[] nums = new int[1000_001];
        for (int i = 0; i <= 1000_000; i++){
            nums[i] = i;
        }
        return nums;
    }




}

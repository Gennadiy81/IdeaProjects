package JavaClasses.day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        System.out.println("number of elements - " + nums.length);
        int len = nums.length;
        System.out.println(len);
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);


    }
}

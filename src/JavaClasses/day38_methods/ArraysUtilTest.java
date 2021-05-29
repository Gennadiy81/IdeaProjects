package JavaClasses.day38_methods;

public class ArraysUtilTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 50};
        ArraysUtil.printArray(nums);

        ArraysUtil.printArray(new int[]{1, 2, 3, 46});

        System.out.println("sum - " + ArraysUtil.sum(nums)); //uses line 5  int[] nums = {5, 23, 1, 543, 50};

        System.out.println("50 Contains - "  + ArraysUtil.contains(nums, 50));


    }
}

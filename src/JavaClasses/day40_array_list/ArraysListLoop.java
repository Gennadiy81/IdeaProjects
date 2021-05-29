package JavaClasses.day40_array_list;
import java.util.*;
public class ArraysListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("nums = " + nums.size());
        nums.add(3); nums.add(3);
        nums.add(45);
        nums.add(56673);
        nums.add(32);
        nums.add(34);
        nums.add(3);
        nums.add(45);
        nums.add(56673);
        nums.add(32);
        nums.add(34);
        nums.add(3);
        System.out.println(nums);
        System.out.println("nums = " + nums.size());
        nums.remove(0);
        System.out.println("nums = " + nums);

        // nums.remove(88);-> index 88
           nums.remove(new Integer(56673));
        System.out.println(nums);
        nums.remove(new Integer(3));
        System.out.println(nums);

        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        System.out.println();
        for (Integer each : nums){// int is also OK
            System.out.print(each + " ");
        }



    }
}

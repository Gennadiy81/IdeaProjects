package JavaClasses.day40_array_list;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("size - " + nums.size());
        System.out.println("nums value - " + nums);
        System.out.println("index '0' is - " + nums.get(0));
        System.out.println("index '1' is - " + nums.get(1));
        System.out.println("index '2' is - " + nums.get(2));

        System.out.println("nums value - " + nums);

        // remove element at index 1


    }
}

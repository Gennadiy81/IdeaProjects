package JavaClasses.day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        printStrList(Arrays.asList("java", "is", "fun"));
        List<Integer> list = Arrays.asList(1, 3, 5);
        System.out.println(sumIntegerList(list));
    }
    public static void printStrList(List<String> stringList) {
        // List<String> str = new ArrayList<>(Arrays.asList("java", "is", "fun"));
        for (String each : stringList) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (int each : integerList) {
            sum += each;
        }
        return sum;
    }
}

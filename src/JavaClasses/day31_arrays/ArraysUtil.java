package JavaClasses.day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[]  num = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in one line
        System.out.println(Arrays.toString(num));

        //sort nums
       Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("num min - " + num[0]);
        System.out.println("max num = " + num[num.length-1]);

        String[] words = {"java", "C#", "python", "Roby"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ",words) + "]");

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));


    }
}

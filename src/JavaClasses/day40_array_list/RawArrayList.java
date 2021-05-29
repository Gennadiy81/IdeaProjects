package JavaClasses.day40_array_list;
import java.util.*;
public class RawArrayList {
    public static void main(String[] args) {
        //Declare raw arrayList
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();
        //add value
        list1.add("java");
        list1.add(true);
        list1.add("wooden spoon");
        list1.add(123);
        System.out.println("list1 = " + list1);
        System.out.println("size - " + list1.size());
    }
}

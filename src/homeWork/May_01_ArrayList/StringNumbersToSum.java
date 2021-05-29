package homeWork.May_01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "456", "876487"));
        for (int i = 0; i < list.size(); i++) {
            int totalSum = 0;
            for (char digit : list.get(i).toCharArray()){
                totalSum += Integer.parseInt(""+digit);
            }
            list.set(i, "" + totalSum);

        }
        System.out.println(list);
    }
}

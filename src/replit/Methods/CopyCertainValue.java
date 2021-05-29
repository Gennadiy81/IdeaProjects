package replit.Methods;

import java.util.*;
public class CopyCertainValue {
    public static void main(String[] args) {
        String[] arr = {"aa", "be", "lol", "lel", "oreo"};
        int count = 0;
        String[] fewValues = new String[3];
        for(String each : arr){

            if(each.contains("e")){
                fewValues[count] = each;
                count++;
            }

        }
        System.out.print(Arrays.toString(fewValues));
    }
}

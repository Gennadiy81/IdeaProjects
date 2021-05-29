package replit.ArrayList;

import java.util.ArrayList;

public class CombineArrays {
    public static void main(String[] args) {
        String[] one = {"f","o","o"};
        String[] two = {" b","a","r"};
        System.out.println(combineRs(one, two));
        
    }
    public static ArrayList<String> combineRs (String[] r1,String[] r2){
        ArrayList<String> arr = new ArrayList<>();
        for (String each : r1){
            arr.add(each);
        }
        for (String each : r2){
            arr.add(each);
        }
        return arr;
    }
}

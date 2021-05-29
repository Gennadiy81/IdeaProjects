package replit.ArrayList;

import java.util.*;
public class Search {
    public static String search(ArrayList<String> r, String find) {
        // complete the method
        String word = "";
        for (String each : r){
            if(each.contains(find)){
                word = each;
                break;
            }else{
                word = "search failed";
            }
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}

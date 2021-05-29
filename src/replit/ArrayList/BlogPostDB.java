package replit.ArrayList;

import java.util.*;

public class BlogPostDB {
    public static String blogDb(ArrayList<String[]> r, String id) {
       List<String> arr = new ArrayList<>();

        String word = "";



        return "";
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String id = in.next();
        in.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
        }

        System.out.println(blogDb(list, id));

    }

}


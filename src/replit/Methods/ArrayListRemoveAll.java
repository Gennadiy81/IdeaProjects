package replit.Methods;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.addAll(Arrays.asList("hi", "hey", "hi", "yo", "hi"));
        System.out.println(removeAll(list, "hi"));
    }

    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(targetWord)){
                wordList.remove(i);
            }
        }
        return wordList;
    }
}

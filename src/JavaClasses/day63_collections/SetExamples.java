package JavaClasses.day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list -> ArrayList
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);

        Set<String> words = new HashSet<>();

        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");

        System.out.println(words);
        //convert your Ser to a List

        List<String> wordList = new ArrayList<>(words);
        wordList.add("world");
        System.out.println(wordList);

       Set<String> linkedHashSet = new LinkedHashSet<>();
       linkedHashSet.add("24");
       linkedHashSet.add("java");
       linkedHashSet.add("$#");
       linkedHashSet.add("53");
       linkedHashSet.add("apple");
       linkedHashSet.add("java");
       linkedHashSet.add("cucumber");
        System.out.println(linkedHashSet);

        Set<String> linkedHashSet2 = new TreeSet<>();
        linkedHashSet2.add("24");
        linkedHashSet2.add("java");
        linkedHashSet2.add("$#");
        linkedHashSet2.add("53");
        linkedHashSet2.add("apple");
        linkedHashSet2.add("java");
        linkedHashSet2.add("cucumber");
        System.out.println(linkedHashSet2);

        }
    }


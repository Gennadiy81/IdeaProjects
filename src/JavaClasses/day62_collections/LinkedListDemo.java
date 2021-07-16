package JavaClasses.day62_collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(32);
        scores.add(42);
        System.out.println(scores);
        System.out.println(scores.get(0));

        friends.add("Gennadiy");
        friends.add("Abbas");
        friends.add("Nevzard");
        friends.add("John");
        System.out.println(friends);
        System.out.println(friends.getLast());


    }
}

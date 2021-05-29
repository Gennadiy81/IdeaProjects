package JavaClasses.day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(Arrays.toString(array));
        int countOfA = array.length -1;
        if (word.endsWith("a")) {
            countOfA++;

        }
        System.out.println("count of a - " + countOfA);


        System.out.println("----- SPLIT WITH EMPTY STRING -----");
        String[] emptyString = word.split("");
        System.out.println(Arrays.toString(emptyString));

        String str = "java1python5htl4c++";
        String[] str2 = str.split("\\d");
        System.out.println(Arrays.toString(str2));
        str = str.replaceAll("\\d", "_");
        System.out.println(str);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }

    }


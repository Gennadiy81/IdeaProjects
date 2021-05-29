package JavaClasses.day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args){
        fullName();
        System.out.println("Full name - " + fullName());
        System.out.println("Is Married - " + isMarried());
        System.out.println("Age - " + getAge());
        System.out.println(getRandomYear());
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }
    public static String fullName(){
        return "Mike Smith";

    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt();
        return randomYear;
    }
}

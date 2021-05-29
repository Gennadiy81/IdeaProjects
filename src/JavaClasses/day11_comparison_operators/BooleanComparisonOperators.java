package JavaClasses.day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(756.2435<234566);
        System.out.println(10<=11);
        System.out.println(5>=3);
        System.out.println(-100 !=43);// -100 is not equal 44
        System.out.println();

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println();


        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        result = 33 > 44;
        System.out.println("result = " + result);
        result =88 < 99;
        System.out.println("result = " + result);
        result =10 >= 10;
        System.out.println("result = " + result);
        result = 123 <= 124;
        System.out.println("result = " + result);
        result = 2!= 2;
        System.out.println("result = " + result);
        System.out.println();

        String city ="Seatle";
        System.out.println(city == "Seatle");
        System.out.println(city == "Chicago");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        ;
        System.out.println("checkNames = " + checkName);
        checkName = name != "Kuzett";
        System.out.println("checkName = " + checkName);
        System.out.println();


        int a1 = 100;
         int a2 = 200;
         boolean letter = a1 < a2;
        System.out.println(letter);

















    }
}

package JavaClasses.day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        // PRE-INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        //POST INCREMENT

        int num3 = 4;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);



        int apples =5;
        int basket =++apples; //first it adds +1 (to apples) to line 21
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);


        int kiwi = 15;
        int kiwiBasket = kiwi++; // it adds + 1 (to kiwi) to line 28
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);


        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);


        int a= 50;
        int b = 22;
        int c = a++ + ++b;// c = 50 + 23
        System.out.println("a = " + a);//51
        System.out.println("b = " + b);//23
        System.out.println("c = " + c);//73






















    }
}

package homeWork.March_20;

public class Analyze_a_b_c_Question {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("A = " + a + ", B = " + b + ", C = " + c);

        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;
        System.out.println( numOne);
        System.out.println(numTwo);
        System.out.println(biggest);
    }

}

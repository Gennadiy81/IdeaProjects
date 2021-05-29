package homeWork.April_01;

public class NumbersDivisibleByThreeAndFive {
    public static void main(String[] args) {
        int divisibleOdd = 1, divisibleEven = 1;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
               // System.out.println();
            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}

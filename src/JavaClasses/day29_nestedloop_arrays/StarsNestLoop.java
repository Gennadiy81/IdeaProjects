package JavaClasses.day29_nestedloop_arrays;

public class StarsNestLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int n = 1; n <= 10; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}


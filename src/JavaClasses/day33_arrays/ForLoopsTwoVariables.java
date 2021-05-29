package JavaClasses.day33_arrays;

public class ForLoopsTwoVariables {
    public static void main(String[] args) {
        System.out.println("----- One way loop -----");
        for (int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("----- Two way loop -----");
        for (int i = 1, j = 4; i <= 4; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}

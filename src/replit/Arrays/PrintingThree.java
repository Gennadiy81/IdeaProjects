package replit.Arrays;

public class PrintingThree {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda"};
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i; j < i + 3; j++) {
                if (j == i + 2) {
                    System.out.print(arr[j]);
                } else {
                    System.out.print(arr[j] + ", ");
                }
            }
            System.out.println();
        }
    }
}

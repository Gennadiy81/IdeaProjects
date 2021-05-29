package replit.Arrays;

public class PrintingTwo {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
        int j = 0;
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
            n++;
            System.out.println(arr[n]);

        }
    }
}

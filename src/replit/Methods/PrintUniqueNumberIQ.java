package replit.Methods;

public class PrintUniqueNumberIQ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 34, 1, 45, 4};
        for (int i = 0; i < arr.length ; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                System.out.print(arr[i] + " ");
            }
        }

    }
}

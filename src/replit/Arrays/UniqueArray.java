package replit.Arrays;

import java.util.Arrays;

public class UniqueArray {
    public static void main(String[] args) {
        int [] arr = {1, 1, 3, 76, 4, 10, 3};
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique){
                System.out.println(arr[i] + " ");
            }

        }




    }
}
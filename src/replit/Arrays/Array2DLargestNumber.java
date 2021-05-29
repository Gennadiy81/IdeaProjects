package replit.Arrays;

public class Array2DLargestNumber {
    public static void main(String[] args) {
        int[][] arr ={{2,4,5,54},{4,9,46,67}};
        int num = arr[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr.length; j++) {
      //          if (arr[i][j] > num){
                    num = arr[i][j];
                }

          //  }

        }
       // System.out.println(num);
    }
}

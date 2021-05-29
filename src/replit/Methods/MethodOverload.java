package replit.Methods;
import java.util.*;
public class MethodOverload {
    // Write your code here
    public static int findMax(int[] arrNums){
        int arr = 0;
        for (int each : arrNums){
            if (each > arr){
                arr = each;
            }
        }
        return arr;
    }
    public static double findMax(double[] arrNums1){
        double arr = 0;
        for (double i : arrNums1){
            if (i > arr){
                arr = i;
            }
        }
        return  arr;
    }
// DO NOT TOUCH THE MAIN METHOD
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }
}


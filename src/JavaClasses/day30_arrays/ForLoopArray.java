package JavaClasses.day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        int i = 1;
        for (int each : data){
            System.out.println(each);
        }

        for (int each : data){
            System.out.print(each + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("----------FOR LOOP--------");

        for (int d = 0; d < data.length; d++){

        }
        System.out.println("last value: " + data[data.length-1]);

        for (int idx = data.length -1; idx >= 0; idx--){
            System.out.println(data[idx]);
        }
    }
}

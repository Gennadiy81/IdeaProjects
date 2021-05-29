package homeWork.April_06;

public class AverageNumber {
    public static void main(String[] args) {
        int[] num = {23,45,78,27};
        int cycle = 0;
        for (int i = 0; i<= num.length-1; i++){
            cycle += num[i];
        }
        System.out.println( cycle / num.length);


    }
}

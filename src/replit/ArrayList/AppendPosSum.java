package replit.ArrayList;
import java.util.*;
public class AppendPosSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
        ArrayList<Integer> sum = new ArrayList<>();
        int num = 0;
        for(int each : nums){
            if(each > 0){
                sum.add(each);
                num += each;
            }
        }
        sum.add(sum.size(), num);
        return sum;
    }

}

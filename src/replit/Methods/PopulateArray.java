package replit.Methods;
import java.util.*;
public class PopulateArray {
    public static int[] populate(int[] r) {
        int[] i = new int[r.length];
        for (int j = 0, c = 1; j < r.length; j++, c++) {
            i[j] = c;
        }
        return i;

    }



    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}

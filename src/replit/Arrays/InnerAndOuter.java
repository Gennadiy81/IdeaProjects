package replit.Arrays;
import java.util.*;
public class InnerAndOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] inner = {8, 9};
        int[] outer = {1, 2, 4, 6};

        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        boolean contains = false;
        int count =0;
        for (int j = 0; j <inner.length; j++) {
            for(int i = 0; i < outer.length; i ++) {
                if (inner[j] == outer[i]) {
                    count++;
                    if (count ==2){
                        break;
                    }
                }
            }
        }
        if (count == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

            }

    }


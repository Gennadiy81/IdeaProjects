package homeWork.April_26;

import java.util.Arrays;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
    public static boolean armstrongNumber(int num){
        String word = num + "";
        String[] toArr = word.split("");
        int powerTo = 1;
        int armsNum = 0;
        for (int i = 0; i < toArr.length; i++){
            powerTo = 1;
            for (int j = 0; j < Integer.parseInt(toArr[toArr.length-1]); j++){
                powerTo *= Integer.parseInt(toArr[i]);
            }
            armsNum += powerTo;
             }
        if (armsNum == num){
            return true;
        }else{
        }
        return false;
    }
}

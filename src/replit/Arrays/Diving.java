package replit.Arrays;
import java.text.DecimalFormat;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float maxNum = 0f;
        float minNum = 0f;
        double judgeSore = 0f, total = 1;
        int judge = 0;
        for (int i = 0; i < score.length; i++){
            judge++;
            System.out.println("Enter score for judge " + judge + ":");
             score[i] = input.nextFloat();
             minNum = score[0];
             maxNum = score[0];
             judgeSore += score[i];
            if(score[i] > maxNum){
                maxNum = score[i];
                if (score[i] < minNum){
                    minNum  = score[i];
                }
            }
        }
        judgeSore = judgeSore - maxNum - minNum;
        System.out.println("Enter difficulty:");
        double difficulty = input.nextFloat();
        for (double n = 0; n < difficulty; n++){
            if (difficulty < 1.2 || difficulty > 3.8){
                 difficulty = input.nextFloat();

            }else{
                break;
            }
        }
        total  = judgeSore * difficulty * 0.6;


        System.out.println("Total: "+df.format(total));
       // System.out.println("Total: " + (judgeSore * difficulty * 0.6));
    }
}

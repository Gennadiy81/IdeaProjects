package replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nanuk {
    public static void main(String[] args) {
        int countNanuk = 0;
        int num = 0;
        int boast = 0;
        int way_stones = 5;
        String word = "";
        List<String> arr = Arrays.asList("1","nanuk","3","5");
        for (String each: arr){
            if (each.equals("nanuk")){
                word = each;
                countNanuk++;
            }else{
                num += Integer.parseInt(each);
            }
            }
        if (num > boast + way_stones && !word.equals("nanuk")){
            System.out.println(true);
        }else if (countNanuk > way_stones){
            System.out.println(false);
        }else if(num < boast + way_stones){
            System.out.println(false);
        }else if(countNanuk < way_stones && num > boast + way_stones){
            System.out.println(true);
        }else if(countNanuk == way_stones && num > boast + way_stones ){
            System.out.println(true);
        }else if(countNanuk > way_stones &&  num > boast + way_stones){

        }


    }

    }


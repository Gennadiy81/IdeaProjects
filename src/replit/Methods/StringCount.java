package replit.Methods;

import java.sql.SQLOutput;

public class StringCount {
    public static void main(String[] args) {
        String str = "ooopendr";
        int count = 0;
        int letters = 0;
        String total = "";
        String strWord = "";

        for (int i = 0; i < str.length(); i=letters) {
            count = 0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    letters++;
                    count++;
                }
            }
                total = count + "" + str.charAt(i);
            if(!strWord.contains(total)){
                strWord += total;

            }
        }
        System.out.println(strWord);
    }
    }




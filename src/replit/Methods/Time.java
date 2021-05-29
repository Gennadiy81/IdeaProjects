package replit.Methods;
import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String word ="";
        if(s.endsWith("AM")) {

            System.out.println(s.replace("AM",""));
        }else if(s.equals("12:00:")){
            System.out.println(s);
        }else if(s.endsWith("PM")){
            word = s.substring(0, s.length()-2);
            String[] arr = word.split(":");
            int numTime = Integer.parseInt(arr[0]);
            numTime += 12;
            String timeStarts = numTime +"";
            word = word.substring(2,word.length());

            System.out.println(numTime+ "" +word);
        }
    }
}

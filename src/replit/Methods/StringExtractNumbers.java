package replit.Methods;
public class StringExtractNumbers {
    public static void main(String[] args) {
        String s = "ja23Km<.0k";
        String nums = "";
        int value = Integer.parseInt(s.replaceAll("[^0-9]", ""));
        System.out.println(value);
       String[] arr = s.split("");
       for (String each : arr){
           if (each.equals("0") || each.equals("1") ||each.equals("2")
                   ||each.equals("3")  ||each.equals("4")  ||each.equals("5") ||
                   each.equals("6" ) ||each.equals("7")  || each.equals("8")  ||each.equals("9")){
               nums += each + "";
           }


       }
        System.out.println(nums);
        }


    }


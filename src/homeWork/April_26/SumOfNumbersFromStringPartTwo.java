package homeWork.April_26;

public class SumOfNumbersFromStringPartTwo {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100g")); ;

    }
    public static int getSumFromString(String str){
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit( str.charAt(i))){ // checks if every character is a number
               num += str.charAt(i);
               if (i == str.length()-1 || !Character.isDigit(str.charAt(i + 1))){
                   sum += Integer.parseInt(num);
                   num = "";
               }
            }
        }
        return sum;
    }
}

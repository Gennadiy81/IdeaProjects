package homeWork.April_06;

public class OneHundredNumber {
    public static void main(String[] args){
       int numbers [] = new int [100];

       for (int i = 0; i < numbers.length; i++ )
           numbers[i] = i + 1;
       for (int each : numbers){
           System.out.print(each + " ");
       }


    }
}

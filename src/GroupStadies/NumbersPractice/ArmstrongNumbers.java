package GroupStadies.NumbersPractice;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(printConsecutiveNumbers(100));
    }

    public static int reverseNegative ( int num){
        int temp = 1;
        for (int i = num; i < 0; i++) {
            temp = i * num;
        }
        return temp;
    }

    public static String armstrong ( int num){
          String temp = num + "";
          int sumWord = 1;
          int sum = 0;
          for (int i = 0; i < temp.length(); i++) {
              for (int j = 0; j < temp.length(); j++) {
                  int tempNum = Integer.parseInt(temp.charAt(i) + "");
                  sumWord *= tempNum;
              }
              sum += sumWord;
              sumWord = 1;
          }
          if (num == sum) {
              return num + " is Armstrong number";
          } else {

          }
          return num + " is nut Armstrong number";
    }

    public static String printConsecutiveNumbers(int num){
        for (int i = 0; i <= num; i++) {
            int count = 0;
            if (i % 2 == 0) {
                System.out.print(" codility ");
                            count++;
            }
            if (i % 3 == 0) {
                System.out.print(" test ");
                count++;
            }
            if (i % 5 == 0){
                System.out.print(" coders ");
                count++;
            }
            if (count > 0){
                System.out.println();
                continue;
            }else{
                System.out.println(i);
            }
        }
        return "";
    }

}







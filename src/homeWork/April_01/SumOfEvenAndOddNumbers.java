package homeWork.April_01;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args){
        int sumEven = 0, sumOdd = 0;
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                sumEven+=i;

            }else if(i % 2 != 0){
                sumOdd += i;

            }
            }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        }

}

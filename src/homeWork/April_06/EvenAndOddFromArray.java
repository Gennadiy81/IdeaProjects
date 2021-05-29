package homeWork.April_06;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] num = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        for (int each : num){
            if (each % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " +  even + " \n Odd: " + odd);
    }
}

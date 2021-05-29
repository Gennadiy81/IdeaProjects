package homeWork.April_10;

public class EvenAndOddArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int[] evenNums = new int[nums.length];
        int indexOfEvenNum = 0;
        System.out.print("Even numbers - ");
        for (int i = 0; i < nums.length; i++) {
            evenNums[i] = nums[i];
            if (evenNums[i] % 2 == 0) {
                indexOfEvenNum = i;
                evenNums[i] = nums[i];
                System.out.print(evenNums[i] + ", ");
            }
            }
        System.out.print("\nOdd numbers - " );
        for (int i = 0; i < nums.length; i++) {
            evenNums[i] = nums[i];
          if (evenNums[i] % 2 != 0) {
              indexOfEvenNum = i;
              System.out.print(+ evenNums[i] + ", ");
            }
        }
    }
}




package GroupStadies.uniqueString;

import java.util.Arrays;
import java.util.Random;

public class StringAndDigits {

    public static int sumOfDigitsFromString(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                sum += Character.getNumericValue(word.charAt(i));
            }
        }
        return sum;
    }

    public static String sortLettersAndNumbers(String word) {
        String tempLetters = "";
        String tempNumbers = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                tempLetters += word.charAt(i);
            } else if (Character.isDigit(word.charAt(i))) {
                tempNumbers += word.charAt(i);
            }
        }
        String[] arrLetters = tempLetters.split("");
        String[] arrNumbers = tempNumbers.split("");
        Arrays.sort(arrLetters);
        Arrays.sort(arrNumbers);

        int letters = 0;
        int numbers = 0;
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                newWord += arrLetters[letters];
                letters++;
            } else if (Character.isDigit(word.charAt(i))) {
                newWord += arrNumbers[numbers];
                numbers++;
            }
        }
        return newWord;
    }

    public static boolean passwordValidationTask(String word) {
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSpace = 0;
        int countSpecialCharacter = 0;
        int countDigit = 0;
        for (char each : word.toCharArray()) {
            if (Character.isSpaceChar(each)) {
                countSpace++;
            } else if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (!Character.isDigit(each) && !Character.isLetter(each)
                    && !Character.isSpaceChar(each)) {
                countSpecialCharacter++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            }
        }
        return (word.length() >= 6 && countSpace == 0 && countUpperCase > 0 &&
                countUpperCase > 0 && countLowerCase > 0 &&
                countSpecialCharacter > 0 && countDigit > 0);

    }

    public static void minAndMax(int[] amigo) {
        int max = amigo[0];
        int min = amigo[0];
        for (int h : amigo) {
            if (max < h) {
                max = h;
            } else if (min > h) {
                min = h;
            }
        }
        System.out.println("Maximum number is - " + max + "\n" +
                "Minimum number is - " + min);

    }

    public static int hello() {
        if (maxArr != null)
            return maxNum(maxArr);
        if (minArr != null) {
            
        }
            return minNum(minArr);
    }

     static int[] maxArr;
     static int countNumbersMax;
     static int numMax = -2147483648;
    public static int maxNum(int[] num1) {
        maxArr = num1;
      if (numMax < num1[countNumbersMax]){
          numMax = num1[countNumbersMax];
      }
        countNumbersMax++;
        if (countNumbersMax == num1.length){
            return numMax;
        }
        return hello();
    }

     static int[] minArr;
     static int countNumbersMin;
     static int numMin = 2147483647;
     public static int minNum(int[] num1) {
        minArr = num1;
        if (numMin > num1[countNumbersMin]){
            numMin = num1[countNumbersMin];
        }
        countNumbersMin++;
        if (countNumbersMin == num1.length){
            return numMin;
        }
        return hello();
    }


    public static void main(String[] args) {
        //System.out.println(minNum(new int[]{100, 2, 3, 33, 5, 22, 1000}));
        // Finding the length of array 'arr'
        int[] arr = {2,4,1,3};
        int length = arr.length;

        // Sorting using a single loop
        for (int j = 0; j < length - 1; j++) {

            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {

                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
        Random random1 = new Random();
        int upper = 100;
        int a = random1.nextInt(upper);
        Random random2 = new Random(20);
        System.out.println(a);
    }
}



package GroupStadies.uniqueString;

import java.util.Arrays;
import java.util.Random;



public class StringAndDigits {

    //Task 1
    public static int sumOfDigitsFromString(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                sum += Character.getNumericValue(word.charAt(i));
            }
        }
        return sum;
    }

    //Task 2 I did it wrong. Maybe I'll come beck to this later
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

    //Task 3
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

    //Task 4
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

    //Belongs to task 4.1 and 4.2
    public static int hello() {
        if (maxArr != null)
            return maxNum(maxArr);
        if (minArr != null) {

        }
        return minNum(minArr);
    }

    //Task 4.1
    static int[] maxArr;
    static int countNumbersMax;
    static int numMax = -2147483648;

    public static int maxNum(int[] num1) {
        maxArr = num1;
        if (numMax < num1[countNumbersMax]) {
            numMax = num1[countNumbersMax];
        }
        countNumbersMax++;
        if (countNumbersMax == num1.length) {
            return numMax;
        }
        return hello();
    }

    //Task 4.2
    static int[] minArr;
    static int countNumbersMin;
    static int numMin = 2147483647;

    public static int minNum(int[] num1) {
        minArr = num1;
        if (numMin > num1[countNumbersMin]) {
            numMin = num1[countNumbersMin];
        }
        countNumbersMin++;
        if (countNumbersMin == num1.length) {
            return numMin;
        }
        return hello();
    }

    //Task 5
    public static int[] arrayAscending(int[] arr) {
        int length = arr.length;
        for (int j = 0; j < length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }
        return arr;
    }

    //Task 6
    public static int[] arrayDescending(int[] arr) {
        int length = arr.length;
        for (int j = 0; j < length - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }
        return arr;
    }

    //Task 7
    public static Integer[] sumOfArrayUniqueElements(int num) {

        if (num > 1 && num < 100) {
            Integer[] arrNum = new Integer[num];
            Random random = new Random();
            int sum = 0;
            int index = 0;
            int uniqueNum;
            for (int i = 0; i < arrNum.length; i++) {
                int rand = random.nextInt(num + num) - num;
                arrNum[index] = rand;
                uniqueNum = 0;
                for (int j = 0; j < arrNum.length; j++) {
                    if (arrNum[index] == arrNum[j]) {
                        uniqueNum++;
                    }
                }
                if (uniqueNum > 1) {
                    i = -1;
                }
                if (uniqueNum == 1) {
                    sum += arrNum[index];
                    if (sum == 0 && index == arrNum.length - 1) {
                        break;
                    } else if (sum != 0 && i == arrNum.length - 1 ||
                            index == arrNum.length - 1 && sum != 0) {
                        i = -1;
                        index = 0;
                        sum = 0;
                        arrNum = new Integer[num];
                    } else {
                        index++;
                    }
                }
            }

            System.out.println("Sum of arr = " + sum);
            return arrNum;

        } else {

        }
        return new Integer[0];
    }

    //Task 8
    public static int[] combination(int[] arr) {
        int tempNum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
             System.out.println(Arrays.toString(arr));
            if (i == arr.length - 2) {
                i = -1;
            }
            tempNum++;
            if (tempNum == 6) {
                break;
            }
        }
        return new int[]{};
    }

    //Task 9
    public static int[] allZeros(int[] arr){
        int j = 0;
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                tempArr[j] = arr[i];
                j++;
            }

        }
        return tempArr;
    }

    //Task 10
    public static int[] combineTwoArrays(int[] arrOne, int[] arrTwo){
        int[] combine = new int[arrOne.length + arrTwo.length];
        int countFirst = 0;
        int countSecond = 0;
        for (int i = 0; i < combine.length; i++) {
            if (i % 2 != 0) {
                combine[i] = arrOne[countFirst];
                countFirst++;
            } else {
                combine[i] = arrTwo[countSecond];
                countSecond++;

            }
        }
        return combine;
    }

    //Task 11
    public static int divideTwoNumbers(int a, int b){
        int sum;
        int[] div = new int[b];
        int indexOne = 0;
        for (int i = a-1; i >= 0; i--) {
            div[indexOne] += 1;
            indexOne++;
            if (indexOne == b)
                indexOne = 0;
        }
        for (int i = 0; i < div.length; i++) {
            for (int j = 0; j < div.length; j++) {
                if (div[i] != div[j]){
                    System.err.println(a + " - is not divisible by - " + b);
                    i = 0;
                }
            }

        }
        sum = div[0];
        return sum;
    }
}



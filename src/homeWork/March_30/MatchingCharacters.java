package homeWork.March_30;

public class MatchingCharacters {
    public static void main(String[] args) {
        String word = "abcdde";
        char letter1 = 'a',
                letter2 = 'b', letter3 = 'c',
                letter4 = 'd', letter5 = 'e';
        int index1 = 0, index2 = 0, index3 = 0, index4 = 0,
                index5 = 0;
        String numberOfLetters1 = "", numberOfLetters2 = "", numberOfLetters3 = "",
                numberOfLetters4 = "", numberOfLetters5 = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter1) {
                numberOfLetters1 += word.charAt(i);
                index1 += i;
            } else if (word.charAt(i) == letter2) {
                numberOfLetters2 += word.charAt(i);
                index2 += i;
            } else if (word.charAt(i) == letter3) {
                numberOfLetters3 += word.charAt(i);
                index3 += i;
            } else if (word.charAt(i) == letter4) {
                numberOfLetters4 += word.charAt(i);
                index4 += i;
            } else if (word.charAt(i) == letter5) {
                numberOfLetters5 += word.charAt(i);
                index5 += i;
            }
        }

        if (index1 > index2 && index1 > index3 && index1 > index4 && index1 > index5) {
            System.out.print(numberOfLetters1);
        } else if (index2 > index1 && index2 > index3 && index2 > index4 && index2 > index5) {
            System.out.print(numberOfLetters2);
        } else if (index3 > index2 && index3 > index1 && index3 > index4 && index3 > index5) {
            System.out.print(numberOfLetters3);
        } else if (index4 > index2 && index4 > index1 && index4 > index3 && index4 > index5) {
            System.out.print(numberOfLetters4);
        } else if (index5 > index2 && index5 > index1 && index5 > index4 && index5 > index3) {
            System.out.print(numberOfLetters5);
        }else{
            System.out.println("Invalid");
        }
    }
}





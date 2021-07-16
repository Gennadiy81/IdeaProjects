
package GroupStadies.uniqueString;

public class IndexOfCharacter {
    public static void main(String[] args) {
//        String str1 = "abcga",  str2 = "aaabc";
//            String sameChars = "";
//            for (int i = 0; i < str2.length(); i++) {
//                if (str1.contains(str2.charAt(i) + "")) {
//                    sameChars += str2.charAt(i);
//                }
//            }
//        System.out.println(sameChars);
        System.out.println(stringWithUniqueFromTwoStrings("abcga", "aaabc"));
        }

    // Given a string str, find the first non-repeating character
    // in it and return its index. If it does not exist, return -1.
    public static int firstNonRepeatingCharacter(String word){
        int countLetters = 0;
        for (int i = 0; i < word.length(); i++) {
            countLetters = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    countLetters++;
                }
            }
            if (countLetters == 1){
                return i;
            }
        }
        return -1;
    }

    // Given a string str, find the last non-repeating character in it
    // and return its index. If it does not exist, return -1.
    public static int lestNonRepeatingCharacter(String word){
    int countLetters =0;
        for (int i = word.length() -1; i >= 0; i--) {
        countLetters = 0;
        for (int j = word.length() -1; j >= 0; j--) {
            if (word.charAt(i) == word.charAt(j)) {
                countLetters++;
            }
        }
        if (countLetters == 1){
            return i;
        }
    }
        return -1;
}

    // Write a method that accept String (and check there are must be only digitals)
    // than returns string without duplicates and only odd numbers ex 161324  3
    public static String uniqueStringOddNumber(String word){
        String oddNum= "";
        for (char ch: word.toCharArray()){
            if(word.indexOf(ch)== word.lastIndexOf(ch) && Character.isDigit(ch)){
                int num = Integer.parseInt(ch + "");
                if (num % 2 == 1)
                    oddNum += num ;
            }
        }
        return oddNum;
    }

    //Write a method that accept  two Strings  and return another String with characters
    // that belong to both Strings (case sensitive)   ex   str1=Chicago str2=Glasgow return “ago”
    public static String stringWithUniqueFromTwoStrings(String wordOne, String wordTwo){
        String tempWord = "";
        for (int i = 0; i < wordOne.length(); i++) {
            for (int j = 0; j < wordTwo.length(); j++) {
                if (wordOne.charAt(i) == wordTwo.charAt(j) && !tempWord.contains(wordOne.charAt(i)+"")){
                    tempWord += wordOne.charAt(i);
                }
            }
        }
        return tempWord;
    }

    //Write a method that accept  two and return another String with words that belong to both Strings (case insensitive)
    // ex str1=”Java is a programming language”  str2= “Python is a programming language” return  ->  is a programming language
    public static String uniqueStringWord(String wordOne, String wordTwo){
        String[] wordArr = wordOne.split(" ");
        String[] wordTwoArr = wordTwo.split(" ");
        String tempWord = "";

        for (int i = 0; i < wordArr.length; i++){
            for (int j = 0; j < wordTwoArr.length; j++) {
                if (wordArr[i].equals(wordTwoArr[j])){
                    tempWord += wordArr[i] + " ";
                }

            }
        }
        return tempWord;
    }
}

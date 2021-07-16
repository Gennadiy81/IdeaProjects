package GroupStadies.uniqueString;

import java.util.Arrays;

  public class UniqueString {
        public static String withoutDuplicatesWay1(String word) {
        String[] tempArr = word.split("");
        Arrays.sort(tempArr);
        String temp = "";
        for (int i = 0; i < tempArr.length; i++) {
            if (i + 1 == tempArr.length) {
                temp += tempArr[i];
                break;
            } else if (!tempArr[i].equals(tempArr[i + 1])) {
                temp += tempArr[i];
            }
        }
        return temp;
    }

        public static String withoutDuplicatesWay2(String word) {
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            if (!temp.contains(word.charAt(i) + "")) {
                temp += word.charAt(i);
            }
        }
        return temp;
    }

        public static StringBuilder withoutDuplicatesUseSB(String wordParam) {
        String wordTwo = "";
        String[] arr = wordParam.split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            wordTwo += arr[i];
        }
        StringBuilder word = new StringBuilder();
        for (int i = 1; i < wordTwo.length(); i++) {
            if (wordTwo.charAt(i - 1) != wordTwo.charAt(i)) {
                word = new StringBuilder(word.append(wordTwo.charAt(i - 1)));
            } else if (i == wordTwo.length() - 1) {
                word = new StringBuilder(word.append(wordTwo.charAt(i)));
            }
        }
        return word;
    }

        public static String changeDuplicatesToExclamation (String word){
          String temp = "";
          for (int i = 0; i < word.length(); i++) {
              if (!temp.contains(word.charAt(i) + "")) {
                  temp += word.charAt(i);
              } else {
                  temp += "!";
              }
          }
          return temp;
      }

        public static String gropedDuplicates (String word){
            String tempUnique = "";
            String temp = "";
            int count1;
            for (int i = 0; i < word.length(); i++) {
                count1 = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count1++;
                    }
                }
                if (count1 == 1) {
                    tempUnique += word.charAt(i);
                } else {
                    temp += word.charAt(i);
                }
            }
            return temp + tempUnique;
        }

        public static String firstlyUpper(String word){
            String tempUpper = "";
            String tempLower = "";
            for (int i  = 0; i < word.length(); i ++){
                if (Character.isUpperCase(word.charAt(i))){
                    tempUpper += word.charAt(i);
                }else{
                    tempLower += word.charAt(i);
                }
            }
            return tempUpper + tempLower;
        }

        public static void uniqueCharacters (String word){
          String temp = "";
          int countA;
          for (int i = 0; i < word.length(); i++) {
              countA = 0;
              for (int j = 0; j < word.length(); j++) {
                  if (word.charAt(i) == word.charAt(j)) {
                      countA++;
                  }
              }
              if (countA == 1) {
                  temp += word.charAt(i);
              }
          }
            System.out.println(temp);
        }

        public static void uniqueCharactersUseSB(String word){
            StringBuilder uniqueCharacters = new StringBuilder(word.length());
            int countLetters;
            for (int i = 0; i < word.length(); i++) {
                countLetters = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)){
                        countLetters++;
                    }
                }
                if (countLetters == 1){
                    uniqueCharacters.append(word.charAt(i));
                }
            }
            System.out.println(uniqueCharacters);

        }

        public static void withOutUniqueCharacters (String word){
            String temp = "";
            int countA;
            for (int i = 0; i < word.length(); i++) {
                countA = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        countA++;
                    }
                }
                if (countA > 1) {
                    temp += word.charAt(i);
                }
            }
            System.out.println(temp);
        }

        public static void uniqueCharactersNoDigits(String word){
            String temp = "";
            int countA;
            for (int i = 0; i < word.length(); i++) {
                countA = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        countA++;
                    }
                }
                if (countA == 1 && Character.isAlphabetic(word.charAt(i))) {
                    temp += word.charAt(i);
                }
            }
            System.out.println(temp);

      }

        public static void uniqueCharactersAddComa(String word){
            String temp = "";
            int countA;
            for (int i = 0; i < word.length(); i++) {
                countA = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        countA++;
                    }
                }
                if (countA == 1) {
                    temp += word.charAt(i) + " ";
                }
            }
            temp = temp.trim();
            temp = temp.replace(" ", ",");
            System.out.println(temp);
        }

      public static void uniqueCharactersReverse(String word){
          String temp = "";
          int countA;
          for (int i = 0; i < word.length(); i++) {
              countA = 0;
              for (int j = 0; j < word.length(); j++) {
                  if (word.charAt(i) == word.charAt(j)) {
                      countA++;
                  }
              }
              if (countA == 1) {
                  temp += word.charAt(i);
              }
          }
          StringBuilder reverseUnique = new StringBuilder(temp);
         reverseUnique.reverse();
          System.out.println(reverseUnique);
      }
    }




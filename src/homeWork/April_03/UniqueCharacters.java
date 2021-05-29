package homeWork.April_03;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";

        for(int index = 0; index < word.length()-1; index++){
           word.charAt(index);
          word.charAt(index+1);
            if(word.charAt(index) != word.charAt(index+1)){
                System.out.println("beep - " + word.charAt(index));
           }


            }
        }

    }

/*
 String word = "jaavva";


 */
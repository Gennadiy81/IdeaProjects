package homeWork.March_22;

public class LongestWord {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "apples";
        if (word1.length() > word2.length() && word1.length() > word3.length() && word1.contains("a") ) {
            System.out.println(word1);
            }else if (word2.length() > word1.length() && word2.length() > word3.length() && word1.contains("a") && word2.contains("a") ){
               System.out.println(word2);
            }else if ((word3.length() > word1.length() && word3.length() > word2.length() && word3.contains("a"))){
               System.out.println(word3);




            }
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = ""; // java

        if(wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree;
        }

        if(biggestWordWithA.isEmpty()) {
            System.out.println("No words contained A");
        } else {
            System.out.println("Longest word with A: " + biggestWordWithA);
        }

    }
}

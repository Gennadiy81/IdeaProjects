package homeWork.April_10;

public class LongestPalindromeArrayIQ {
    public static void main(String[] args){
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String palindrome = "";
        String reversWord = "";
        int indexOfArray = 0;
        for (int i = 0; i < words.length; i++){
            reversWord = "";
            for (int n = words[i].length()-1; n >= 0; n--){
                reversWord = reversWord + words[i].charAt(n);
                if (words[i].equals(reversWord)){
                    if (reversWord.length() > palindrome.length()) {
                        palindrome = reversWord;
                        indexOfArray = i;
                    }
                }
            }
        }
        if (palindrome.equals(words[indexOfArray])){
            System.out.println(palindrome);
        }else{
            System.out.println("No palindrome");
        }
    }
}

package OfficeHours.Practice_04_06_2021;

public class PalindromeCheck {
    public static void main(String[] args) {
        boolean isPalindrome = true;
        String word = "anna";
        for (int i = 0; i < word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}

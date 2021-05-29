package replit.Methods;



public class MethodsPalindrome {
    public static void main(String[] args) {
        String word = "Nurses run";
        boolean isPalindrome = true;
        String word2 = word.replace(" ", "");
        word2 = word2.toLowerCase();
        for (int i = 0; i < word2.length()/2; i ++){
            if (word2.charAt(i) != word2.charAt(word2.length()-1-i)){
                isPalindrome = false;
                break;
            }else{

            }
        }
        System.out.println("Is palindrome - " + isPalindrome);

        }
        }



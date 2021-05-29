package JavaClasses.day38_methods;




public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        System.out.println("civic = " + isPalindrome("civic"));
        System.out.println("cybertek = " + isPalindrome("cybertec"));
        System.out.println(revers("java"));

    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String revers(String str) {
        String revers = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revers += str.charAt(i);

        }
        return revers;
    }
}







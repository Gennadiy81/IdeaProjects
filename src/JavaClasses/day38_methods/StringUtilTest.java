package JavaClasses.day38_methods;


import static JavaClasses.day38_methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: Username cannot be null or empty");
        }
        System.out.println("\"civic\" is palindrome word - " + isPalindrome("civic"));
        System.out.println("revers \"java\" - " + revers("java"));
        String wordRevers = revers("java");
        System.out.println("wordRevers = " + wordRevers);
    }
}

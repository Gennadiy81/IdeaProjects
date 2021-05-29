package replit.Methods;
import java.util.*;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int rem, rev= 0, temp;
        temp = num;
        while( num != 0 )
        {
            rem= num % 10;
            rev= rev * 10 + rem;
            num=num/10;
        }
        if (temp == rev)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

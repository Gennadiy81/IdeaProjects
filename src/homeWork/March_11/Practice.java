package homeWork.March_11;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        ;Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        //your code here
        char A = 'a', b = 'b', c = 'c';
        if(A == 'a'){
            System.out.println("a is wrong");
        }else if(b == b){
            System.out.println("b is correct");
        }else if(c == c){
            System.out.println("c is wrong");
        }

    }
}

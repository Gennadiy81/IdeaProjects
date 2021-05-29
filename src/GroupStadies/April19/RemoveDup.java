package GroupStadies.April19;
import java.util.*;
public class RemoveDup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(returnSing(input.nextLine()));

    }
    public static  String returnSing(String str) {

        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (!word.contains(str.charAt(i) + "")) {
                word += str.charAt(i);
            }
        }
        return word;
    }
}

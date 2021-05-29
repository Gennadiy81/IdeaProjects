package replit.Loops;
import java.util.*;
public class CatAndDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int i = 0; i <= word.length() -3; i++) {
            String word2 = word.substring(i, i+3);
            if (word2.equals("cat")){
                countOfCats++;
            }else if (word2.equals("dog")){
                countOfDogs++;
            }
        }
        if (countOfCats == countOfDogs){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        }

        }

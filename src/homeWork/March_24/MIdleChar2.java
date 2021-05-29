package homeWork.March_24;

public class MIdleChar2 {
    public static void main(String[] args){
        String word1 = "elephant";
        if (word1.length() % 2 == 0){
            System.out.println(word1.substring(3, 5));
        }else if(word1.length() % 2 != 0){
            System.out.println(word1.substring(3,4));
        }
    }
}

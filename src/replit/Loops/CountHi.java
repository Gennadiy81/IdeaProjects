package replit.Loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "hi java hi hi";

         int word1 = 0;
        for(int i = 0; i <= str.length()-2; i++){
            String word = str.substring(i, i+2);
            if(word.equals("hi")){
                 word1++;
            }

        }
        System.out.println(word1);

    }
}

package replit.Strings;

public class WithoutX {
    public static void main(String[] args){
        String word = "xHiX";
       if(word.startsWith("x") && word.endsWith("X")){
          System.out.println(word.substring(+1, word.length()-1 ));

           }else   if(word.endsWith("X")){
           System.out.println(word.substring(0, word.length()-1));
           }else if(word.startsWith("x")){
           System.out.println(word.substring(+1));
            }else{
           System.out.println(word);

       }

    }
}

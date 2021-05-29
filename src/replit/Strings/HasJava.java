package replit.Strings;

public class HasJava {
    public static void main(String[] args){
        String word = "rjava";
        if (word.startsWith("java")){
            System.out.println(true);
        }else if(word.equals(word.substring(0,1) + "java")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

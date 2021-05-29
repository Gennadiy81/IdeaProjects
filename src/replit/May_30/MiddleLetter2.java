package replit.May_30;

public class MiddleLetter2 {
    public static void main(String[] args) {
        String word = "fifteen";
        if(word.length()> 5 && word.length() %2 !=0){
            int middleNum = word.length()/2;
            System.out.println(word.substring(middleNum-1, middleNum+2));
        }
    }
}

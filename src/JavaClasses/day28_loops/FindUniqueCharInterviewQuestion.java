package JavaClasses.day28_loops;

public class FindUniqueCharInterviewQuestion {
    public static void main(String[] args) {
        String word = "javvaja";
        String unique = "";
        for (int i=0; i < word.length(); i++){

           if(!unique.contains(word.charAt(i) +"")){
               unique += word.charAt(i);
           }
        }
        System.out.println(unique);
    }
}

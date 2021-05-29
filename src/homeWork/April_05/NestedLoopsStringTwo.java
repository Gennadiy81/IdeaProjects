package homeWork.April_05;

public class NestedLoopsStringTwo {
    public static void main (String [] args){
        String word = "java";
        for(int i =0; i < word.length(); i++){
            for (int n = 0; n < i; n++){
                System.out.print(word);
            }
            System.out.println();

        }
    }
}

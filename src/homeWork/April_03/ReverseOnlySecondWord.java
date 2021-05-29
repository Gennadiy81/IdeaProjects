package homeWork.April_03;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {
        String word = "I love java";
        int count = 0;
        String wordLove = "";
        String revers = "";
        for (int i = 0; i < word.length()-4; i++){
            wordLove = word.substring(i, i + 4);
            if (wordLove.equals("love")){
                for(int n = wordLove.length()-1; n >= 0; n--){
                    revers += wordLove.charAt(n);
                }
                System.out.println("I " + revers + " java");
            }

        }

    }

}

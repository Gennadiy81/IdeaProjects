package homeWork.April_03;

public class CamelCaseCheck {
    public static void main(String[] args) {
        String word = "thisHasManyWordsToFind";
        int count = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) <= 'Z' &&  word.charAt(i) >= 'A' ){
                count++;
            }
        }
        System.out.println(count + 1);
    }
}

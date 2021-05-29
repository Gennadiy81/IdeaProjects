package homeWork.April_26;

public class CountLetters {
    public static void main(String[] args) {
        String str = "apple tree";
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) ) {
                    count++;
                }
            }

            if (!word.contains(str.charAt(i) + "")) {
                        word += str.charAt(i);
                        System.out.println(count + " - " + str.charAt(i));
            }
        }
    }
}

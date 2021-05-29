package JavaClasses.day21_string_monipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
        System.out.println(word);
        word = word.replace("hub", "lab");
        System.out.println("word = " + word);
        String sentence = "Java is fun";
        String withOutSpaces = sentence.replace(" ", "");
        String javaWithSelenium = sentence.replace("Java", "Selenium").replace("fun", "a lot of fun");
        System.out.println(javaWithSelenium);
        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ", "").
                                replace(",", "").
                                replace(" results for java book", "");
        System.out.println(result);


        int count = Integer.parseInt(result);
        if(count > 0){
            System.out.println(count);
        }
    }
}

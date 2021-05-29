package JavaClasses.day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "Java Is Fan";
        System.out.println(word);
        //TO LOWER CASE
        System.out.println(word.toLowerCase());
        System.out.println("CyberTak".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase = " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change company "Amazon" to "AMAZON"
        company = company.toUpperCase();
        System.out.println("Company = " + company);
    }
}

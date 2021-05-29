package JavaClasses.day19_class_vs_object_strings;

public class StringStartsWithEndWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));

        System.out.println(word.startsWith("Int"));


        System.out.println(word.endsWith("idea"));

        String name = "Maria";
        if (name.startsWith("a")) {
            System.out.println("All good");
        } else {
            System.out.println("Not good");
        }
        /**
         * Mr. -> Man
         * Dr> -> Doctor
         * Mrs. -> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */
        String firstName = "Sr. Nadir";

        if (firstName.startsWith("Ms")) {
            System.out.println("Nadir is a man");

        } else if (firstName.startsWith("D")) {
            System.out.println("Nadir is a doctor");

        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married woman");

        } else if (firstName.startsWith("Ms")) {
            System.out.println("Single woman");

        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");

        } else {
            System.out.println("Normal name");
        }

        String webUrl = "chicago.ua";

        if (webUrl.endsWith("gov")) {
            System.out.println("Government website");

        } else if (webUrl.endsWith(".ru")) {
            System.out.println("russian website");

        } else if (webUrl.endsWith(".ua")) {
            System.out.println("Ukrainian website");

        }
    }
}









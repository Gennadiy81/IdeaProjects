package JavaClasses.day35_methods_with_param;


public class Counters {
    public static void main(String[] args) {
        count(5);
        String word = "wooden spoon";
        count(word.length());
        int birthYear = 2001;
        printAge(birthYear);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");

        }
    }


    public static void printAge(int yar) {
        int ageYear = 2021 - yar;
        System.out.println();
        System.out.println("Birth year - " + yar + " age - " + ageYear);

    }
}

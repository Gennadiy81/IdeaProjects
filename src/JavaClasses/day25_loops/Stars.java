package JavaClasses.day25_loops;

public class Stars {
    public static void main(String[] args) {
        for(int i = 0; i <=15; i++ ){
            System.out.print(" *");
        }
        System.out.println();
        String myStars = "";
        for(int stars = 1; stars <= 5; stars++){
            myStars = myStars + "* ";
        }
        System.out.println(" my stars = " + myStars.trim());

    }
}

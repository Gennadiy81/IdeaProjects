package homeWork.March_20;
import java.util.Scanner;

public class PersonalInformationScannerAndIf {
    public static void main(String[] args) {
        int numberOfPeople, numberOfPets;
        String cityLiveIn, favoriteAnimal;
        boolean liveInDowntown, movingToSuburbs;
        Scanner info = new Scanner(System.in);

        System.out.println("How many people are you live with?");
        numberOfPeople = info.nextInt();

        if (numberOfPeople <= 2) {
            System.out.println("Nice you live with " + numberOfPeople + " people");
        } else if (numberOfPeople >= 3 && numberOfPeople <= 6) {
            System.out.println("Nice you live with " + numberOfPeople + " people");
        } else if (numberOfPeople > 6) {
            System.out.println("Nice you live with " + numberOfPeople + " people");
        }
        System.out.println("What city are you live in?");
        cityLiveIn = info.next();
        System.out.println("Grate you live in " + cityLiveIn);

        System.out.println("Do you live in downtown?");
        liveInDowntown = info.nextBoolean();

        if (liveInDowntown) {

            System.out.println("Live in downtown of " + cityLiveIn);
            System.out.println(("Are you planning to move to suburbs?"));
            movingToSuburbs = info.nextBoolean();
            if (movingToSuburbs) {
                System.out.println("Do it its great");
            } else {
                System.out.println("You should think about it");
            }
            }else{
            System.out.println("Nice to live in suburbs of " + cityLiveIn);
            }
        System.out.println("What is your favorite animal?");
        favoriteAnimal = info.next();
        System.out.println("Wow " + favoriteAnimal + " is a grate animal");
        System.out.println("How many pats do you want?");
        numberOfPets = info.nextInt();
        if(numberOfPets == 1){
            System.out.println("Interesting, do you want only " + numberOfPets +
                    " " +  favoriteAnimal + "?");
        }else{
            System.out.println("Interesting, do you want " + numberOfPets +
                    " " +  favoriteAnimal + "s?");
        }




    }
}



















package JavaClasses.day18_conditions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 30;
        if (score >= 1 && score <= 40){
            System.out.println(score + " Grade D");
        }else if (score >= 41 && score <= 60){
            System.out.println(score + " Grade C");
        }else if (score >= 61 && score <= 90){
            System.out.println(score + " Grade B");
        }else if (score >= 91 && score <= 100){
           System.out.println(score + " Grade A");
        }else {
            System.out.println(score + "Invalid number");


        }

    }
}

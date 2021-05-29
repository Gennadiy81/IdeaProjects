package JavaClasses.day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
       checkEligible(680);
       checkEligible(800);
        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println("score - " + score);
    }
    public static void checkEligible(int creditScore){
        if (creditScore > 700){
            System.out.println("Eligible for leasing this car");
        }else {
            System.out.println("Not eligible for leasing this car");
        }

        }

    public static int getCreditScore() {
        return 800;
    }

}

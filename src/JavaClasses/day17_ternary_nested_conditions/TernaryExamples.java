package JavaClasses.day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 30;
        String quality = "good";
        String result = (score > 60) ? "pass" : "fail";
        System.out.println("result " + result);
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("quality " + x);
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade " + grade);
        String evenOdd=(score%2==0)? "even":"odd";
        System.out.println("even odd " + evenOdd);
        quality = "bad";
        System.out.println(quality.equals("good") ? 100: 0);

        int score1 = 100;
        char grade1 = (score1 > 90) ? 'A' : 'B';
        System.out.println(grade1);

    }
}

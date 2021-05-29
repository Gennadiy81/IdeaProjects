package JavaClasses.day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = hourlyRate > 45 ? "accept" : "reject";
        System.out.println("reply " + reply);

        String todayClass = "java";
        String teacher = ( todayClass.equals("java")) ? "Saim/Morado" : "Nadir";
        System.out.println("Today teacher is " + teacher);


        boolean eligibleToDrive = true;
        String driving = eligibleToDrive ? "Have DL, can drive" : "Dont have DL, can't drive";
        System.out.println(driving);

    }
}

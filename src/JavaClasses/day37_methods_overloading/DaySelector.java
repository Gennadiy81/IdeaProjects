package JavaClasses.day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(7));
        System.out.println(getDayName(0));
        for (int i = 1; i <= 8; i++) {
            System.out.println(i + " = " + getDayName(i));
            String someDay = getDayName(4);
            System.out.println(someDay);

        }
    }


    public static String getDayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;


        }
    }
}

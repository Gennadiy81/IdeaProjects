package homeWork.March_20;

public class OfficeHoursSchedule {
    public static void main(String[] args) {
        String day = "Monday";
        switch("Sunday"){
            case "Monday": case "Tuesday": case "Wednesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Thursday":
                System.out.println("Soft Skills day");
                break;
            case "Friday":
                System.out.println("Day off");
                break;
            case "Saturday": case "Sunday":
                System.out.println("Already a long day, no office hours");
                break;
            default:
                    System.out.println("Invalid day given");

        }
    }
}

package JavaClasses.day15_logical_swith_ternery;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("! true - " + (!true));
        System.out.println("! falls - " + (!false));

        int age = 20;
        if (!(age >= 7)) {
            System.out.println("Need to sit in child car sit. " + age);
        } else {
            System.out.println("Can sit normal sit. age - " + age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smocking is not allowed here. exit");
        } else {
            System.out.println("This area is for smoking");
        }
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Items not affordable");
        }
        String env = "qa";
        if (!env.equals("qa")) {


        }else{
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){

        }else{

            System.out.println("Not interesting, thank you");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc321")) {


        }else{
            System.out.println("Incorrect Password ");
        }
    }
}
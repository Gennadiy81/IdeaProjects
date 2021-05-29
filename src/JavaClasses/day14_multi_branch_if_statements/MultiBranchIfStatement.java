package JavaClasses.day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }

        if (day == 2) {
            System.out.println("Tuesday");
        }

        if (day == 3) {
            System.out.println("Wednesday");
        }

        System.out.println("============= MULTi BRANCH IF STATEMENT =========");

         day = 20;
        if (day == 1) {
            System.out.println("Today is Monday");

        } else if (day == 2) {
            System.out.println("Today is Tuesday");

        }else if(day == 3){
            System.out.println("Today is Wednesday");
        }else{
            System.out.println("Java day");
        }
        System.out.println("Every day code java");
    }
}
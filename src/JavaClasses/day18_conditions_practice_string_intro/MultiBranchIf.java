package JavaClasses.day18_conditions_practice_string_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 0;
        if(number > 0){
            System.out.println(number + " is positive");
        }else if(number < 0){
            System.out.println(number + " number negative");
        }else{
            System.out.println(number + " number is zero");
        }
    }
}

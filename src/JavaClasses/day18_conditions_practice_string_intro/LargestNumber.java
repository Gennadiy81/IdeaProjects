package JavaClasses.day18_conditions_practice_string_intro;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 3, num2 = 3, num3 = 3;
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the biggest number");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is the biggest number");
        }else{
            System.out.println(num3 + " is the biggest number");
        }
    }
}

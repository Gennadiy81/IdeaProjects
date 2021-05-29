package JavaClasses.day15_logical_swith_ternery;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade  = 'A';
        if(grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("Passed with grade - " + grade);
        }else if(grade == 'D'){
            System.out.println("Qualify for retake with grade - " + grade);
        }else if(grade == 'E'){
          System.out.println("Fail when grade - " + grade);
        }else{
            System.out.println("invalid grade - " + grade);
        }


        if(grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b'
                || grade == 'C' || grade == 'c'){
            System.out.println("Passed with grade - " + grade);
        }else if(grade == 'D'){
            System.out.println("Qualify for retake with grade - " + grade);
        }else if(grade == 'E'){
            System.out.println("Fail when grade - " + grade);
        }else{
            System.out.println("invalid grade - " + grade);
        }
}
    }
package JavaClasses.day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        if(jobTitle.isEmpty()){
            System.out.println("Job title is missing, pleas resend");
        }else{
            System.out.println("Job title looks good");
        }
        if(jobTitle.length() == 0){
            System.out.println("Job title is empty");
        }else{
            System.out.println("Job title is not empty");
        }
        System.out.println(jobTitle.equals((" ")));

        String word = " ";
        System.out.println(word.isEmpty());
    }
}

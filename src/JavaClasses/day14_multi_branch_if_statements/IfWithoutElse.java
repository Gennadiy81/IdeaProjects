package JavaClasses.day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args){
        int year = 2021;
        if(year == 2020){
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask and keep distance");
        }
        System.out.println("Keep coding java");


        String country = "USA";
        if(country.equals("USA")){
            System.out.println("Capitol of USA is Washington DC");
            System.out.println("White house is on Pennsylvania Ave");

        }
        System.out.println("Welcome to " + country);



    }
}

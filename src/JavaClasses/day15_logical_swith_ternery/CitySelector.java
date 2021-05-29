package JavaClasses.day15_logical_swith_ternery;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        if(city.equals("Tampa") || city.equals("Seattle")){
            System.out.println("Willing to relocate to - " + city);
        }else{
            System.out.println("Not considering relocate to - " + city);
        }

        String teacher = "Nadir";
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a Java class with " + teacher);
        }else{
            System.out.println("Soft skill with " + teacher);
        }

         teacher = "Saim";
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is java class with " + teacher);

        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skill class with" + teacher);
        }else{
            System.out.println("Some classes with " + teacher) ;

        }
        // company - "Google" OR salary >= 100k --> accept the offer
        String company = "Google";
        double salary = 85_000.0;

        if(company.equals("Google") || salary >= 100_000.0){
            System.out.println("Accept the offer " + company);
        }else{
            System.out.println("Rejecting offer from " + company);
        }

    }
}

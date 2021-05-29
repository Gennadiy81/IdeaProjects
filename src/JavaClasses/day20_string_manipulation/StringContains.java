package JavaClasses.day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains(("ital")));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains(("J")));
        System.out.println(company.contains("One"));

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(("|"))){
            System.out.println("Pass - title check passed");
        }else{
            System.out.println("Pass - title check failed");
        }


        String firstName = "Gennadiy";
        if(firstName.contains("d") && firstName.contains("n")){
            System.out.println("Name check passed");
        }else{
            System.out.println("Name check failed");
        }

        String lestName = "Nadir";
        if(lestName.contains("N") || lestName.contains("r")){
            System.out.println("N and r is present");
        }else{
            System.out.println("N and r is not present");
        }


        String email = "Gsemendyev.yahoo.com";
        if(email.contains("s") && email.endsWith("com")){
            System.out.println("Email correct");
        }else {
            System.out.println("Email incorrect");
        }

        if(email.toLowerCase().contains("g")){
            System.out.println("My email");
        }else{
            System.out.println("Not my email");
        }


    }
}

package JavaClasses.day05_primitives_concatanation;

public class House {
    public static void main(String[] args){
        String houseType = "Single family home";
        byte numberOfBedrooms = 2;
        byte numberOfKitchens = 1;
        boolean isThereABasement = true;
        boolean isThereAAttic = false;
        boolean isThereAPool = false;
        boolean isTheHouseForSale = false;
        String address = "\t8308 W Addison St\n\t\t    Chicago,IL 60634";
        boolean isAPark = true;
        double ratingOfSchool = 4.5;

        System.out.println("What kind of house:" + houseType);
        System.out.println("Number of bedrooms:" + numberOfBedrooms);
        System.out.println("Number of kitchens:" + numberOfKitchens);
        System.out.println("Is there basement?:" + isThereABasement);
        System.out.println("Is there attic?:" + isThereAAttic);
        System.out.println("Is there pool?:" + isThereAPool);
        System.out.println("Is the house for sale?:" + isTheHouseForSale);
        System.out.println("Address:" + address);
        System.out.println("Is a park near by?:" + isAPark);
        System.out.println("School rating:" + ratingOfSchool);
    }
}

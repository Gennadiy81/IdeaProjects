package JavaClasses.day16_switch_turnary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 5;
        double startingPrice = 0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println( "Studio apartment selected");
                startingPrice = 1454;

                break;
            case 2:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 3:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedrooms unavailable");

        }
        System.out.println(numberOfBedrooms + " Bedrooms selected, starting price $" + startingPrice);
    }
}

package homeWork.March_17;

public class HouseBuyer {
    public static void main(String[] args){
        String neighborhoodName = "Canyon";
        double averagePrice, rating;
        boolean gated, allowPets;

        switch(neighborhoodName){
            case " Hills":
                averagePrice = 89_000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                System.out.println("Neighborhood: " + neighborhoodName);
                System.out.println("Average price: " + averagePrice);
                System.out.println("Rating: " + rating);
                System.out.println("Gated: " + gated);
                System.out.println("Allow pets: " + allowPets);
                break;
            case "Oaks":
                averagePrice = 75_000;
                rating = 3.5;
                gated = false;
                allowPets = true;
                System.out.println("Neighborhood: " + neighborhoodName);
                System.out.println("Average price: " + averagePrice);
                System.out.println("Rating: " + rating);
                System.out.println("Gated: " + gated);
                System.out.println("Allow pets: " + allowPets);
                break;
            case("Highland"):
                averagePrice = 150_000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                System.out.println("Neighborhood: " + neighborhoodName);
                System.out.println("Average price: " + averagePrice);
                System.out.println("Rating: " + rating);
                System.out.println("Gated: " + gated);
                System.out.println("Allow pets: " + allowPets);
                break;
            case("Canyon"):
                averagePrice = 201_000;
                rating = 4.8;
                gated = true;
                allowPets = true;
                System.out.println("Neighborhood: " + neighborhoodName);
                System.out.println("Average price: " + averagePrice);
                System.out.println("Rating: " + rating);
                System.out.println("Gated: " + gated);
                System.out.println("Allow pets: " + allowPets);
                break;
        }
    }
    }


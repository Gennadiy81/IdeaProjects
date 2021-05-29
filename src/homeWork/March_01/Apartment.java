package homeWork.March_01;

public class Apartment {
    public static void main( String[] args) {
        String streetName = "Diversey Ave", cityName = "Chicago", stateName = "IL", ownerName = "Jhon Smith";
        byte numberOfOwners = 1, numberOfUnits = 6, washersAndDryers = 4, lengthOfLeas = 18,
                totalResidents = 18, numberOfFloors = 3, numberOfParking = 6;
        short unitSize = 850;
        int zipCode = 60707, buildingNumber = 8309, ownerPhoneNumber = 1231234576;
        float reviewStars = 4.3F;
        double monthlyRent = 1100;
        char sideStreet = 'W';
        boolean allowsPets = false, hasPool = true, gasStationNear = true, hasBasement = true,
                availableUnitsForRent = true, hasAirConditioner = true, wheelChairAccess = true;
        int tenPresentOff = (int) monthlyRent - (int) monthlyRent / 100 * 10;
        double after3Years = tenPresentOff;
        int twentyPresentOff = (int) monthlyRent - (int) monthlyRent / 100 * 20;
        double afterSixYears = twentyPresentOff;
        int averageResidentsPerUnit = totalResidents / numberOfUnits;
        int averageParkingSpotsPerUnit = numberOfParking / numberOfUnits;
        int unitsPerFloor = numberOfUnits / numberOfFloors;
        int numberResidentsPerUnit = totalResidents / numberOfUnits;
        System.out.println("Apartment information: ");
        System.out.println("Address: " + buildingNumber + " " + sideStreet + " " + streetName + "\n\t\t "
                + cityName + " " + stateName + " " + zipCode);
        System.out.println("Average unit size: " + unitSize + "sqft");
        System.out.println("Units per floor: " + unitsPerFloor);
        System.out.println("Monthly rent total: " + "$" + monthlyRent);
        System.out.println("Monthly rent after 3 years (discount 10%) total: " + "$" + after3Years);
        System.out.println("Monthly rent after 6 years (discount 20%) total: " + "$" + afterSixYears);
        System.out.println("Number of units: " + numberOfUnits);
        System.out.println("Number of residents per unit: " + numberResidentsPerUnit);
        System.out.println("Residents total: " + totalResidents);
        System.out.println("Number of floors: " + numberOfFloors);
        System.out.println("Number of parking spaces: " + numberOfParking);
        System.out.println("Near gas station: " + gasStationNear);
        System.out.println("Has a basement: " + hasBasement);
        System.out.println("units for rent: " + availableUnitsForRent);
        System.out.println("Has air conditioner: " + hasAirConditioner);
        System.out.println("Has wheel chair access: " + wheelChairAccess);
        System.out.println("Number of review stars: " + reviewStars);
    }


    }

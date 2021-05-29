package homeWork.March_20;

public class HouseOccupants {
    public static void main(String[] args) {
        String houseType = "Apartment";

        switch(houseType){
            case "Tree house":
                int maxOccupants = 1;
                System.out.println(houseType + " maximum occupants: " + maxOccupants);
                break;
            case "Mobile home":
                maxOccupants = 2;
                System.out.println(houseType + " maximum occupants: " + maxOccupants);
                break;

            case "Apartment":
                maxOccupants = 4;
                System.out.println(houseType + " maximum occupants: " + maxOccupants);
                break;
            case "Town house":
                maxOccupants = 6;
                System.out.println(houseType + " maximum occupants: " + maxOccupants);
                break;
            case "Villa":
                maxOccupants = 8;
                System.out.println(houseType + " maximum occupants: " + maxOccupants);
                break;
            case "Mansion":
                maxOccupants = 10;
                System.out.println(houseType + " maximum occupants: " + maxOccupants);
                break;
            default:
                System.out.println("Invalid entry");


        }

    }
}

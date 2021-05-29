package JavaClasses.day15_logical_swith_ternery;

public class UsedCarSelector {
    public static void main(String[] args) {
        String model = "Honda";
        double budget = 5000, carPrice = 4500;
        if(carPrice <= budget && (model.equals("Toyota") || model.equals("Honda"))){
            System.out.println("Ready to purchase model - " + model + " price - " + carPrice);
        }else{
            System.out.println("Not interested in model - " + model + " price - " + carPrice);
        }
    }
}

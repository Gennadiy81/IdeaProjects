package JavaClasses.day16_switch_turnary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0.0, calories = 0;

        switch (size){
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println( "Venti Cappuccino please" );
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println( "We don't serve that" + size + "of Cappuccino");
        }
                System.out.println("Your cappuccino is " + size +
                        ", price is " + price + "$ you will consume " + calories + " calories");
    }
}

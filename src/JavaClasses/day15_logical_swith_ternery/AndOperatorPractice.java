package JavaClasses.day15_logical_swith_ternery;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true, freeShipping = true;
        String itemName = "Wooden spoon";
        if(onSale && freeShipping){

            System.out.println("Add item to cart - " + itemName);

        }else {
            System.out.println("Continue shopping for good deals - " + itemName);
        }
        if(freeShipping && onSale && itemName.equals("Wooden spoon")){
            System.out.println("adding item to cart - " + itemName);

        }else{
            System.out.println("Continue shopping for good deals - " + itemName);
        }


    }
}

package JavaClasses.day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
String brand = "Samsung";
String model = "S8";
String color = "Blue";
double price = 699.99;
        boolean hasCamera = true;
        int storage = 256;
        System.out.println(brand);
        System.out.println(model);
        //WITH MESSAGE
        System.out.println("Brand is " + brand);
        System.out.println("Model Is " + model);
        System.out.println("Color is " + color);
        System.out.println("Prise is " +"$" + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - " + hasCamera);


    }
}

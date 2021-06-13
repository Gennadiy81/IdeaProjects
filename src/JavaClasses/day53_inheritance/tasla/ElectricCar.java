package JavaClasses.day53_inheritance.tasla;

public class ElectricCar {

    private String model;
    private String make;
    private double price;
    private int year;
    private int range;
    private static int count;



    public ElectricCar(String model, String make, double price, int year, int range) {
        setMake(make);
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }
    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    protected void drive(int miles){
         if (range == 0 || range - miles < 0 ){
             System.out.println("ERROR: Cannot drive that far, need to charge");
         } else {
             range -= miles;
             System.out.println("Driving " + miles + " miles");
         }

    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make.isEmpty()){
            System.out.println("ERROR: Cannot be blank");
        }else {
            this.make = make;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

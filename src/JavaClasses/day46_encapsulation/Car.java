package JavaClasses.day46_encapsulation;

public class Car {

   private String madel;
   private int year;
   private double mileage;

   public void setMadel(String carMadel) {
     madel = carMadel;
   }
   public String getMadel(){
      return madel;
   }

   public  int getYear(){
      return year;
   }

   public void setYear(int modelYear){
      year = modelYear;
   }

    public void setMileage(double mileage){
      this.mileage = mileage;
    }

    public double getMileage(){
      return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "madel='" + madel + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

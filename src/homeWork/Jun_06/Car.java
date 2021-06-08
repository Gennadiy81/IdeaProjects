package homeWork.Jun_06;

public class Car {
    String model;
    double engineSize;
    String color;
    int topSpeed;
    String carName;


    static int tires;

    private String nickName;

    static{
        System.out.println("I love java XOXOXO!!!");
    }

    public void tireBroke(int num){
        System.out.println("tires left - " + (tires -= num));
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        carName = nickName;
    }

     public static String  carIsRunning(){
         return "running is ok";
     }

     public void oldOrNew(String used){
         System.out.println("My car is good - " + used);
     }
     public static void myCarIsBest(int num){
         System.out.println("My car is number is the bast of - " + num);
     }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineSize=" + engineSize +
                ", color='" + color + '\'' +
                ", topSpeed=" + topSpeed +
                ", carName='" + carName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

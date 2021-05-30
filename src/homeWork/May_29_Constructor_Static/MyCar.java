package homeWork.May_29_Constructor_Static;


import java.util.ArrayList;
import java.util.List;

public class MyCar {
    private String model;
    private String color;
    private int age;
    private int cylinders;

    public List<String> myOldModels() {
        return oldModels;
    }

    public void setOldModels(String myOldModels) {
        oldModels.add(myOldModels);
    }

    private List<String> oldModels = new ArrayList<>();

    @Override
    public String toString() {
        return "MyCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", cylinders=" + cylinders +
                ", oldModels=" + oldModels +
                '}';
    }

    public static void myCarNice(int mileage, boolean newOrOld){
        System.out.println("mileage - " + mileage + " car is almost new - " + newOrOld);

    }
    public MyCar(){
        System.out.println("My car is awesome");
    }

    public MyCar(String car, int age){
        setAge(age);
        setModel(car);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}

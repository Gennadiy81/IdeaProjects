package homeWork.May_29_Constructor_Ctatic;

public class MyCar {
    private String model;
    private String color;
    private int age;
    private int cylinders;

    @Override
    public String toString() {
        return "MyCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", cylinders=" + cylinders +
                '}';
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

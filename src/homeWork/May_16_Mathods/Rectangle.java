package homeWork.May_16_Mathods;

public class Rectangle {
    double with;
    double height;
    double area;

    @Override
    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
    public void setDimensions(double setWith, double setHeight){
        with = setWith;
        height = setHeight;
    }

    public double getArea(){
       area = with * height;
        return area;
    }
}

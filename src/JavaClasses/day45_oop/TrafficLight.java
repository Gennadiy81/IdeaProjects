package JavaClasses.day45_oop;

public class TrafficLight {
    String color;
    public void showColor(){
       System.out.println("current color - " + color);
    }

        public void changeColor(String newColor){
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green") ||
                newColor.equalsIgnoreCase("yellow")){
            System.out.println("changing to new color - " + newColor);
            color = newColor;
        }else{
            System.out.println("Invalid color - " + newColor);
        }

        }


}

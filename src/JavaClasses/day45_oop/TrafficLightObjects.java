package JavaClasses.day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";
        trafficLight.changeColor("red");
        trafficLight.showColor();
        trafficLight.changeColor("green");
        trafficLight.showColor();
        TrafficLight trafficLightNew = new TrafficLight();
        trafficLightNew.changeColor("blue");
        trafficLightNew.showColor();

    }
}

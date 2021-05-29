package homeWork.March_06;

public class Computer {
    public static void main(String[] args){
        String brand = "Dell", processor = "Intel CoreI7", color = "Black";
        int ramMemory = 16, storageMemory = 1, numberOfMonitors = 2,
                numbersOfUsbSlots = 7;
        boolean hasMonitor = true, hasWiFiCard = true;
        double price = 1600, cpu = 2.9, hasUsb = 3.1;
        System.out.println( "Computer brand: " + brand +"\nProcessor: "
                + processor + "\nRam memory: " + ramMemory + "GB" + "\nStorage memory: "
                + storageMemory +"T" + "\nHas monitor: " + hasMonitor + "\nMonitors: "
                + numberOfMonitors + "\nHas WiFi: " + hasWiFiCard + "\nNumber of usb slots: " + numbersOfUsbSlots +
                "\nUSB: " + hasUsb);
    }
}

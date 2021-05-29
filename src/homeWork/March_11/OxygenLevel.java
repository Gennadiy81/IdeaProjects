package homeWork.March_11;

public class OxygenLevel {
    public static void main(String[] args){
        int oxygenLevel = 100;
        if(oxygenLevel > 90){
            System.out.println("Your tank is full");
        }else if(oxygenLevel > 80){
            System.out.println("Still ok");
        }else if(oxygenLevel > 70){
            System.out.println("Dont go too far");
        }else if(oxygenLevel > 50){
            System.out.println("Start head back");
        }else if(oxygenLevel > 50){
            System.out.println("Be careful you at 50% ");
        }
    }
}

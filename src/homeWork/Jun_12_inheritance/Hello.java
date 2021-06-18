package homeWork.Jun_12_inheritance;

public class Hello extends MobileApp{
    public Hello(String name, double version, double num){
        super(name, version, num);
    }
    @Override
    public double percentageFee(double percent) {
        System.out.println("Imported app sale fee " + percent + "%");
        super.percentageFee(20);
        return percent = 20;





    }
}

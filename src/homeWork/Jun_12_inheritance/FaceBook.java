package homeWork.Jun_12_inheritance;

public class FaceBook extends MobileApp {
    FaceBook(String name, double version, double budget){
        super(name, version, budget);
    }

    @Override
    public double percentageFee(double percent){
        System.out.println("Domestic app sale fee" + percent + "%");
       return percent = 10;
    }
}

package homeWork.Jun_12_inheritance;

public class AppTest {
    public static void main(String[] args) {

        MobileApp.setBudget(1000);
        Hello hello = new Hello("Hello", 6.0, 400);
        hello.setAppCost();
        hello.percentageFee(10);
        System.out.println(hello.version);
        System.out.println("Money left - " + MobileApp.getBudget());

        FaceBook faceBook = new FaceBook("FaceBook", 1.1, 510);
        faceBook.percentageFee(30);

        faceBook.setAppCost();
        System.out.println(MobileApp.getBudget());




    }
}

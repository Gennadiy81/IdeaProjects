package homeWork.Jun_12;

public class AppTest {
    public static void main(String[] args) {

        MobileApp.budget = 1000;
        Hello hello = new Hello("Hello", 6.0, 400);
        hello.setAppCost();
        hello.percentageFee(10);
        System.out.println(hello.version);
        System.out.println("Money left - " + MobileApp.budget);

        FaceBook faceBook = new FaceBook("FaceBook", 1.1, 530);





    }
}

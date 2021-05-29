package JavaClasses.day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String model = "A";
        String make = "Mercedes";
        double leasePrice = 0.0;
        //  if(make.equals("Mercedes") && model.equals("E")){
        //  leasePrice = 500;
        //   }else if(make.equals("Mercedes") && model.equals("A")){
        //      leasePrice = 400;
        //  }
        if (make.equals("Mercedes")) {

            if (model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;

            } else {
                System.out.println("Invalid make");
            }


            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("lease price = " + leasePrice);
        }
    }
}
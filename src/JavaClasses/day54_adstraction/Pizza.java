package JavaClasses.day54_adstraction;

public class Pizza extends MenuItem{


    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put topping and cheese on the top");

    }

    @Override
    public void serve() {
        System.out.println("Put on the board");
    }
}

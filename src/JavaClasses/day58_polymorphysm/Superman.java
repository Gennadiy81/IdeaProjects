package JavaClasses.day58_polymorphysm;

public class Superman extends Father implements Worker{
    @Override
    public void work(String job) {
        System.out.println("Superman is working as " + job);
    }

    @Override
    public double getPaid() {
        System.out.println("Supermen get paid ");
        return 8000;
    }
}
package JavaClasses.day52_inheritance;

public class Instagram extends  MobileApp {
    public void postPhoto() {
        System.out.println("Posting photo ");
    }
    @Override
    public void useTheApp(int minutes){
        System.out.println("Using instagram app features");
        postPhoto();

       super.useTheApp(minutes);
        postPhoto();
    }
}

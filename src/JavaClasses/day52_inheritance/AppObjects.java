package JavaClasses.day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        instagram.download();
        instagram.setVersion(5.3);

        Discord d22Discord = new Discord();
        d22Discord.setName("Discord");
        d22Discord.useTheApp(100);
        d22Discord.setVersion(6.234);
        d22Discord.download();
        d22Discord.printInfo();
    }
}

package JavaClasses.day34_void_methods;

public class etsySearchTest {
    public static void main(String[] args) {
        System.out.println("-- Starting Etsy Smoke Test --");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to http://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click sear");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("PASS: Search results are successfully displayed");
    }
}

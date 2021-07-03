package JavaClasses.day59_polymorphism_exceptions;

public class ElementTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        loginLink.getText();
        loginLink.sendKeys("Hello");

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtils.clickElement(loginLink);
        WebElementUtils.clickElement(username);


        WebElement login = WebElementUtils.getLinkWithText("link");
           login.click();
    }

}

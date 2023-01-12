package automation_exercise_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class HeaderItemsValidation {
    public static void main(String[] args) {

        /*
        Given user navigates to “https://automationexercise.com/”
        Then validate all below header items are displayed and enabled and their text is as below
        Home
        Products
        Cart
        Signup / Login
        Test Cases
        API Testing
        Video Tutorials
        Contact us

         */

        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        List<WebElement> headerItems = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        String[] headerText = {" Home", " Products", " Cart", " Signup / Login", " Test Cases", " API Testing", " Video Tutorials", " Contact us"};


        for (int i = 0; i < headerItems.size(); i++) {

            System.out.println(headerItems.get(i).getText().equals(headerText[i]));
            System.out.println(headerItems.get(i).getText());
           System.out.println(headerItems.get(i).isEnabled());
           System.out.println(headerItems.get(i).isDisplayed());


        }

        Driver.quitDriver();
    }
}

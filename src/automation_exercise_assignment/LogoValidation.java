package automation_exercise_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class LogoValidation {

    public static void main(String[] args) {


        /*
        Test Case 1: Validate Automation Exercise site logo
        Given user navigates to “https://automationexercise.com/”
        Then user should see logo on top-left

         */
        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        WebElement logo = driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']"));

        System.out.println(logo.isDisplayed());

        Driver.quitDriver();







    }
}


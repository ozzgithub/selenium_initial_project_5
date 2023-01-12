package automation_exercise_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class FooterValidation {
    public static void main(String[] args) {

        /*
        Test Case 4: Validate Automation Exercise site footer
        Given user navigates to “https://automationexercise.com/”
        Then user should see “Copyright © 2021 All rights reserved” text in the footer



         */

        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        WebElement footer = driver.findElement(By.cssSelector("p[class='pull-left']"));

        System.out.println(footer.getText());
        System.out.println(footer.isDisplayed());



        Driver.quitDriver();
    }
}

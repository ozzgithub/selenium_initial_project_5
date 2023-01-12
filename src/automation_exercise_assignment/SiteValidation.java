package automation_exercise_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class SiteValidation {

    public static void main(String[] args) {




     /*
    Test Case 5: Validate Automation Exercise site Test Cases page
    Given user navigates to “https://automationexercise.com/”
    When user clicks on “Test Cases” header item
    Then validate user is navigated to “Test Cases” page successfully by it’s title and url
    Expected URL = https://automationexercise.com/test_cases
    Expected Title = Automation Practice Website for UI Testing - Test Cases

     */

        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        WebElement testCase = driver.findElement(By.xpath("(//ul//li)[5]"));

        testCase.click();

        driver.navigate().to("https://automationexercise.com/test_cases");

        System.out.println("Expected Title" + driver.getTitle());
        System.out.println("Expected URL" + driver.getCurrentUrl());


        Driver.quitDriver();
    }

}

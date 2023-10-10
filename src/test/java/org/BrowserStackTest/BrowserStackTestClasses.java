package org.BrowserStackTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserStackTestClasses {

    WebDriver driver;

    BrowserStackHomePage browserStackHomePage;

    BrowserStackSignupPage browserStackSignupPage;




   @BeforeClass
    public void openBrowser(){
        driver = new ChromeDriver();

        driver.get("https://www.browserstack.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();

    }


    @Test
    public void browserHomePage(){
        browserStackHomePage = new BrowserStackHomePage(driver);
        browserStackHomePage.verifyText();
        browserStackHomePage.clickOnGetStartedButton();

    }

    @Test
    public void browserstackSignup(){
         browserStackSignupPage = new BrowserStackSignupPage(driver);
         browserStackSignupPage.linkText();
         browserStackSignupPage.enterUserName();
         browserStackSignupPage.enterEmail();
         browserStackSignupPage.enterPassword();

         browserStackSignupPage.clickChkBox();
         browserStackSignupPage.clickSignUpBtn();
    }

    @AfterClass
    public void teardown(){

       driver.close();
    }


}

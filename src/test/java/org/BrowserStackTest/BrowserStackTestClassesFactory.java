package org.BrowserStackTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserStackTestClassesFactory {

    WebDriver driver;

    BrowserStackHomePageFactory browserStackHomePageFactory;

    BrowserStackSignupPageFactory browserStackSignupPageFactory;



   @BeforeClass
    public void openBrowser(){
        driver = new ChromeDriver();

        driver.get("https://www.browserstack.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();

    }


    @Test
    public void browserHomePage(){
        browserStackHomePageFactory = new BrowserStackHomePageFactory(driver);
        browserStackHomePageFactory.verifyText();
        browserStackHomePageFactory.clickOnGetStartedButton();

    }

    @Test
    public void browserstackSignup(){
        browserStackSignupPageFactory = new BrowserStackSignupPageFactory(driver);
        browserStackSignupPageFactory.linkText();
        browserStackSignupPageFactory.enterUserName();
        browserStackSignupPageFactory.enterEmail();
        browserStackSignupPageFactory.enterPassword();

        browserStackSignupPageFactory.clickChkBox();
        browserStackSignupPageFactory.clickSignUpBtn();
    }

    @AfterClass
    public void teardown(){

       driver.close();
    }


}

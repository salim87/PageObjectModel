package org.BrowserStackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackSignupPage {

    WebDriver driver;

    public BrowserStackSignupPage(WebDriver driver){
      this.driver = driver;
    }

    By linkText = By.xpath("//h1[normalize-space()='Create a FREE Account']");

    By uName= By.id("user_full_name");

    By email = By.id("user_email_login");

    By password= By.id("user_password");

    By checkbox= By.id("tnc_checkbox");

    By signup = By.id("user_submit");


    public void linkText(){

        driver.findElement(linkText).getText();
    }

    public void enterUserName(){
        driver.findElement(uName).sendKeys("Nahid");
    }

    public void enterEmail(){
        driver.findElement(email).sendKeys("abd@ymail.com");

    }

    public void enterPassword(){
        driver.findElement(password).sendKeys("123456");
    }

    public void clickChkBox(){
        driver.findElement(checkbox).click();
    }

    public void clickSignUpBtn(){
        driver.findElement(signup).click();
    }
}

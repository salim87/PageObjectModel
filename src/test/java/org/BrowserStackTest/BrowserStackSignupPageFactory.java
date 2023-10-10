package org.BrowserStackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSignupPageFactory {

    WebDriver driver;


    @FindBy (xpath = "//h1[normalize-space()='Create a FREE Account']")
    WebElement linkText;

    @FindBy(id= "user_full_name")
    WebElement uName;

    @FindBy(id="user_email_login")
    WebElement email;

    @FindBy(id="user_password")
    WebElement password;

    @FindBy(id="tnc_checkbox")
    WebElement checkbox;

    @FindBy(id = "user_submit")
    WebElement signup;

    public BrowserStackSignupPageFactory(WebDriver driver){
      this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void linkText(){
        linkText.getText();

    }

    public void enterUserName(){

        uName.sendKeys("Nahid");
    }

    public void enterEmail(){
       email.sendKeys("abd@ymail.com");

    }

    public void enterPassword(){

       password.sendKeys("123456");
    }

    public void clickChkBox(){

        checkbox.click();
    }

    public void clickSignUpBtn(){

        signup.click();
    }
}

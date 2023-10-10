package org.BrowserStackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackHomePage {

    WebDriver driver;


    public BrowserStackHomePage(WebDriver driver){
        this.driver=driver;
    }


    By id= By.id("signupModalButton");

    By text= By.xpath("(//div[@class='text-section text-center no-pad']/h1)[1]");


    public void verifyText(){

        driver.findElement(text).getText();

    }

    public void clickOnGetStartedButton(){

        driver.findElement(id).click();
    }


}

package org.BrowserStackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackHomePageFactory {

    WebDriver driver;




    @FindBy(id="signupModalButton")
    WebElement getStarted;

    @FindBy (xpath = "(//div[@class='text-section text-center no-pad']/h1)[1]")
    WebElement text;

    public BrowserStackHomePageFactory(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyText(){

        text.getText();


    }

    public void clickOnGetStartedButton(){

        getStarted.click();
    }


}

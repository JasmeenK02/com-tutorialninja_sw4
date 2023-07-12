package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By actualReturningCxText= By.xpath("//h2[contains(text(),'Returning Customer')]");
    By email= By.xpath("//input[@id='input-email']");
    By password= By.xpath("//input[@id='input-password']");
    By clickLoginButton= By.xpath("//input[@value='Login']");
    By actualTextMyAccount = By.xpath("//h2[contains(text(),'My Account')]");


    //2.3 Verify the text “Returning Customer”.
    public void verifyTextReturningCustomer() {
        assertVerifyText(actualReturningCxText,"Returning Customer","Return customer text not found");
    }

    //4.3 Enter Email address
    public void enterEmail(){
        sendTextToElement(email,"vpa12345@gmail.com");
    }
    //4.3 Enter Password
    public void enterPassword() {
        sendTextToElement(password,"123456vv");
    }
    //4.6 Click on Login button
    public void clickLoginButton() {
        clickOnElement(clickLoginButton);
    }

    //4.7 Verify text “My Account”
    public void verifyMyAccountText() {
        assertVerifyText(actualTextMyAccount,"My Account","My account text not found");
    }
}

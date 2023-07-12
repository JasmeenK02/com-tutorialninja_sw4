package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By actualTextCheckout = By.xpath("//a[text()='Checkout']");
    By actualTextNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    By guestCheckout = By.xpath("//input[@value='guest']");
    By continueTab = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName =  By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By phoneNumber = By.xpath("//input[@id='input-payment-telephone']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By zone = By.xpath("//select[@id='input-payment-zone']");
    By clickOnContinueButton = By.xpath("//input[@id='button-guest']");
    By addComment = By.xpath("//textarea[@class='form-control']");
    By termsCheckBox = By.xpath("//input[@name='agree']");
    By continue1 = By.xpath("//input[@id='button-payment-method']");
    By actualWarningText = By.xpath("//div[text()='Warning: Payment method required!']");


    //2.16 Verify the text “Checkout”
    public void verifyTextCheckout(){
        assertVerifyText(actualTextCheckout,"Checkout", "Checkout text not found");
    }
    //2.17 Verify the Text “New Customer”
    public void verifyNewCustomerText(){
        assertVerifyText(actualTextNewCustomer, "New Customer", "New Customer text not found");
    }
    //2.18 Click on “Guest Checkout” radio button
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
    //2.19 Click on “Continue” tab
    public void clickOnContinue(){
        clickOnElement(continueTab);
    }
    //2.20 Fill the mandatory fields
    public void fillMandatoryFields(){
        sendTextToElement(firstName, "Jasmeen");
        sendTextToElement(lastName, "Kaur");
        sendTextToElement(email, "jasmeen144@gmail.com");
        sendTextToElement(phoneNumber, "1234567891");
        sendTextToElement(address, "Best Street");
        sendTextToElement(city, "London");
        sendTextToElement(postcode, "LA4 5ES");
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        selectByVisibleTextFromDropDown(zone, "adgbfhfy");
    }
    //2.21 Click on “Continue” Button
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }

    //2.22 Add Comments About your order into text area
    public void addComments(){
        sendTextToElement(addComment, "Please knock on the door bit loud");
    }
    //2.23 Check the Terms & Conditions check box
    public void checkTheTerms(){
        clickOnElement(termsCheckBox);
    }
    //2.24 Click on “Continue” button
    public void clickOnContinue1(){
        clickOnElement(continue1);
    }
    //2.25 Verify the message “Warning: Payment method required!
    public void verifyWarningText(){
        assertVerifyText(actualWarningText, "Warning: Payment method required!", "Warning text not found");
    }
}

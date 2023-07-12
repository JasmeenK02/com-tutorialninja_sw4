package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By actualTextRegister= By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName= By.xpath("//input[@id='input-firstname']");
    By lastName= By.xpath("//input[@id='input-lastname']");
    By email= By.xpath("//input[@id='input-email']");
    By telephone= By.xpath("//input[@id='input-telephone']");
    By password= By.xpath("//input[@id='input-password']");
    By confirmPassword= By.xpath("//input[@id='input-confirm']");
    By clickRadioSubscription= By.xpath("//input[@type='radio'][@name='newsletter'][@value='1']");
    By clickOnPrivacyBox= By.xpath("//input[@type='checkbox'][@name='agree'][@value='1']");
    By clickOnContinue= By.xpath("//input[@value='Continue']");
    By actualAccountCreatedText= By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By clickContinueTwo= By.xpath("//a[contains(text(),'Continue')]");



    //1.3 Verify the text “Register Account”.
    public void verifyTextRegister() {
        assertVerifyText(actualTextRegister,"Register Account","Register text not verify");
    }

    //3.3 Enter First Name
    public void firstName() {
        sendTextToElement(firstName,"Jasmeen");
    }
    //3.4 Enter Last Name
    public void lastName() {
        sendTextToElement(lastName,"Kaur");
    }
    //3.5 Enter Email
    public void email(){
        sendTextToElement(email,"jasmeen144@gmail.com");
    }

    //3.6 Enter Telephone
    public void telephone() {
        sendTextToElement(telephone,"1234567891");
    }

    //3.7 Enter Password
    public void setPassword() {
        sendTextToElement(password,"jask1234");
    }

    //3.8 Enter Password Confirm
    public void setConfirmPassword() {
        sendTextToElement(confirmPassword,"jask1234");
    }
    //3.9 Select Subscribe Yes radio button
    public void clickOnSubscribe() {
        clickOnElement(clickRadioSubscription);
    }
    //3.10 Click on Privacy Policy check box
    public void clickOnPrivacyBox() {
        clickOnElement(clickOnPrivacyBox);
    }
    //3.11 Click on Continue button
    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
    }
    //3.12 Verify the message “Your Account Has Been Created!”
    public void verifyAccountText() {
        assertVerifyText(actualAccountCreatedText,"Your Account Has Been Created!", "Account text not found");
    }
    //3.13 Click on Continue button
    public void clickOnContinueTwo() {
        clickOnElement(clickContinueTwo);
    }

}

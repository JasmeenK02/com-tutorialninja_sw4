package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By currencyPound= By.xpath("//button[contains(text(),'£Pound Sterling')]");
    By allListOfTopMenu = By.xpath("//button[contains(text(),'£Pound Sterling')]");
    By desktop = By.linkText("Desktops");
    By laptop = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");
    By showAllLaptops = By.linkText("Show AllLaptops & Notebooks");
    By getListForAccountDropdown= By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By clickOnMyAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By actualLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By clickOnContinue= By.xpath("//a[contains(text(),'Continue')]");


    public void currency()
    {
        clickOnElement(currency);
        clickOnElement(currencyPound);
    }
    // 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
    //string
    //1.2 This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu){
        // 1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
        // 1.2 This method should click on the menu whatever name is passed as parameter. Write the following Test:
        List<WebElement> topMenuList = getListOfElements(allListOfTopMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(allListOfTopMenu);
        }
        clickOnElement(By.linkText(menu));
    }

    //1.1 Mouse hover on “Desktops” Tab and click
    public void mouseHoverAndClickOnDesktop(){
        mouseHoverToElementAndClick(desktop);
    }

    //1.2 call selectMenu method and pass the menu = “Show All Desktops”
    public void callAllMenuBySelect(String desktopText) {
        selectMenu(desktopText);
    }
    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    public void mouseHoverAndClickOnLaptops(){
        mouseHoverToElementAndClick(laptop);
    }

    //3.1 Mouse hover on “Components” Tab and click
    public void mouseHoverAndClickOnComponents(){
        mouseHoverToElementAndClick(components);
    }

    //2.2 Click on “Show All Laptops & Notebooks”
    public void clickOnShowAllLaptopNotebooks(){
        clickOnElement(showAllLaptops);
    }



    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(getListForAccountDropdown);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(getListForAccountDropdown);
        }
    }
    public void clickOnAccountLink()
    {
        //1.1 Click on My Account Link.
        clickOnElement(clickOnMyAccountLink);
    }
    public void callMethodAndPassParameter(String accountText)
    {
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions(accountText);
    }

    public void verifyTextLogOut()
    {
        // 3.16 Verify the text “Account Logout”
        assertVerifyText(actualLogoutText,"Account Logout","Logout text not found");
    }
    public void clickContinue() {
        //3.17 Click on Continue button
        clickOnElement(clickOnContinue);
    }


}

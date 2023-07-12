package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By actualShoppingCartText = By.xpath("//a[contains(text(),'Shopping Cart')]");
    By actualProductName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By actualDeliveryDate = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");
    By actualModel = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By actualTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By actualTextMacbook= By.linkText("MacBook");
    By changeQtyToTwo = By.xpath("//div[@class='input-group btn-block']//input[@class='form-control']");
    By clickOnUpdate =By.xpath("//i[@class='fa fa-refresh']");
    By actualTextCartModify= By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By actualTotalLaptop= By.xpath("//div[@class='col-sm-4 col-sm-offset-8']//td[text()='£737.45']");
    By clickOnCheckOutButton = By.xpath("//a[contains(text(),'Checkout')]");





    //2.11 Verify the text "Shopping Cart"
    //2.9 Verify the text "Shopping Cart"
    public void verifyShoppingCartText(){
        assertVerifyText(actualShoppingCartText,"Shopping Cart", "Shopping Cart not found");
    }
    //2.12 Verify the Product name "HP LP3065"
    public void verifyProductName(){
        assertVerifyText(actualProductName,"HP LP3065","Product name not matched");
    }

    //  2.13 Verify the Delivery Date "2022-11-30"
    public void verifyDeliveryDateText(){
        assertVerifyText(actualDeliveryDate,"2022-11-30","Delivery date not matched");
    }

    //2.14 Verify the Model "Product21"
    public void verifyModelText() {
        assertVerifyText(actualModel, "Product21", "Model not matched");
    }

    //2.15 Verify the Total "£74.73"
    public void verifyTotal(){
        assertVerifyText(actualTotal, "£74.73", "Total not matched");
    }
    //2.10 Verify the Product name "MacBook"
    public void verifyProductMacBook() {
        assertVerifyText(actualTextMacbook,"MacBook","MacBook text not found");
    }
    //2.11 Change Quantity "2"
    public void changeQty()
    {
        driver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@class='form-control']")).clear();
        sendTextToElement(changeQtyToTwo,"2");
    }
    //2.12 Click on “Update” Tab
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdate);
    }
    //2.13 Verify the message “Success: You have modified your shopping cart!”
    public void verifyTextSuccess()
    {
        assertVerifyText(actualTextCartModify,"Success: You have modified your shopping cart!\n" +
                "×","success text not found");
    }
    //2.14 Verify the Total £737.45
    public void verifyTotalOfLaptop()
    {
        assertVerifyText(actualTotalLaptop,"£737.45","Total text not found");
    }
    //2.15 Click on “Checkout” button
    public void checkoutButton()
    {
        clickOnElement(clickOnCheckOutButton);
    }
}

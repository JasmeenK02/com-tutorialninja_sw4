package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopProductPage extends Utility {
    By actualMacBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By clickAddToCart = By.xpath("//button[@id='button-cart']");
    By actualTextSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnShoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    //2.5 Verify the text “MacBook”
    public void verifyTextMacBook() {
        assertVerifyText(actualMacBookText, "MacBook", "MacBook text not found");
    }

    //2.6 Click on ‘Add To Cart’ button
    public void clickOnAddToCartLink() {
        clickOnElement(clickAddToCart);
    }

    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    public void verifyTextSuccess() {
        assertVerifyText(actualTextSuccessMessage, "Success: You have added MacBook to your shopping cart!\n×", "Product added text not found");
    }

    //2.8 Click on link “shopping cart” display into success message
    public void clickOnShoppingCartLink() {
        clickOnElement(clickOnShoppingCartLink);
    }


}

package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopProductsPage extends Utility {

    By actualHPText = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By selectQty = By.name("quantity");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By actualSuccessMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");




    //2.5 Verify the Text "HP LP3065"
    public void verifyTextHP(){
        assertVerifyText(actualHPText,"HP LP3065", "HP LP3065 Product not display");
    }

    //2.6 Select Delivery Date "2023-11-30"
    String year = "2023";
    String month = "November";
    String date = "30";
    public void selectDeliveryDate() {
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    //2.7.Enter Qty "1” using Select class.
    public void enterQty(){
        sendTextToElement(selectQty, "1");

    }

    //2.8 Click on “Add to Cart” button
    public void clickOnAddToCart(){

        clickOnElement(addToCart);
    }

    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    public void verifySuccessText(){
        assertVerifyText(actualSuccessMessage,"Success:You have added HP LP3065 to your shopping cart!","Product not added to cart.");
    }

    //2.10 Click on link “shopping cart” display into success
    public void clickOnShoppingCart(){
        clickOnElement(clickShoppingCart);
    }





}


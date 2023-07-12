package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {

    By actualDesktops = By.xpath("//h2[contains(text(),'Desktops')]");
    By position = By.xpath("//select[@id='input-sort']");
    By productListBefore = By.xpath("//h4/a");
    By productListAfter = By.xpath("//h4/a");
    By productHP = By.xpath("//a[contains(text(),'HP LP3065')]");




   // 1.3 Verify the text ‘Desktops’
    public void verifyDesktopsText(){

        assertVerifyText(actualDesktops,"Desktops","Desktop text not found");
    }

    // 1.3 Select Sort By position "Name: Z to A" ---- for desktop page
    public void changeProductPosition(String textPosition) {
        selectByVisibleTextFromDropDown(position,textPosition);
    }

    //1.4 Verify the Product will arrange in Descending order.
    public void verifyProductInDescendingOrder() {
        listOfElementVerifyInReverse(productListBefore,position,"Name (Z - A)",productListAfter);
    }

    //2.4 Select product “HP LP3065”
    public void selectHPLP3065(){
        clickOnElement(productHP);
    }


}












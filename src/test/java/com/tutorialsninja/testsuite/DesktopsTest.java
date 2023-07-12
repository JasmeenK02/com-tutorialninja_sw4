package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopProductsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCart;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {


    HomePage homePage= new HomePage();
    DesktopsPage desktopPage= new DesktopsPage();
    DesktopProductsPage productPage= new DesktopProductsPage();
    ShoppingCart shoppingCart= new ShoppingCart();

    //1.Test name verifyProductArrangeInAlphaBaticalOrder()
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException
    {
        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverAndClickOnDesktop();
        Thread.sleep(1000);

        //1.2 Click on “Show All Desktops”
        homePage.callAllMenuBySelect("Show AllDesktops");
        Thread.sleep(1000);

        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.changeProductPosition("Name (Z - A)");
        Thread.sleep(1000);

        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.verifyProductInDescendingOrder();
        Thread.sleep(1000);
    }

    // 2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException
    {
        // Convert the currency to pound
        homePage.currency();
        Thread.sleep(500);

        //2.1 Mouse hover on Desktops Tab. and click
        homePage.mouseHoverAndClickOnDesktop();
        Thread.sleep(1000);

        //2.2 Click on “Show All Desktops”
        homePage.callAllMenuBySelect("Show AllDesktops");
        Thread.sleep(1000);

        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.changeProductPosition("Name (A - Z)");
        Thread.sleep(1000);

        //2.4 Select product “HP LP3065”
        desktopPage.selectHPLP3065();
        Thread.sleep(1000);

        //2.5 Verify the Text "HP LP3065"
        productPage.verifyTextHP();
        Thread.sleep(1000);

        //2.6 Select Delivery Date "2022-11-30"
        productPage.selectDeliveryDate();
        Thread.sleep(2000);

        //2.7.Enter Qty "1” using Select class.
        productPage.enterQty();
        Thread.sleep(1000);

        //2.8 Click on “Add to Cart” button
        productPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        productPage.verifySuccessText();
        Thread.sleep(1000);

        //2.10 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCart();
        Thread.sleep(1000);

        //2.11 Verify the text "Shopping Cart"
        shoppingCart.verifyShoppingCartText();
        Thread.sleep(1000);

        //2.12 Verify the Product name "HP LP3065"
        shoppingCart.verifyProductName();
        Thread.sleep(1000);

        //2.13 Verify the Delivery Date "2022-11-30"
        shoppingCart.verifyDeliveryDateText();
        Thread.sleep(1000);

        //2.14 Verify the Model "Product21"
        shoppingCart.verifyModelText();
        Thread.sleep(1000);

        //2.15 Verify the Totat "£74.73"
        shoppingCart.verifyTotal();
        Thread.sleep(3000);
    }


}

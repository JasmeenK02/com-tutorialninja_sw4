package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage= new HomePage();
    DesktopsPage desktopClass= new DesktopsPage();
     LaptopNotebookPage laptopNotebookPage = new LaptopNotebookPage();
    ComponentsPage componentPage= new ComponentsPage();

    @Test
    // 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverAndClickOnDesktop();
        Thread.sleep(1000);

        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.callAllMenuBySelect("Show AllDesktops");
        Thread.sleep(1000);

        //1.3 Verify the text ‘Desktops’
        desktopClass.verifyDesktopsText();
        Thread.sleep(1000);
    }

    //2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException
    {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverAndClickOnLaptops();
        Thread.sleep(1000);

        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");
        Thread.sleep(1000);

        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopNotebookPage.verifyTextLaptopNoteBook();
        Thread.sleep(1000);
    }

    //3. verifyUserShouldNavigateToComponentsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException
    {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverAndClickOnComponents();
        Thread.sleep(1000);

        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.callAllMenuBySelect("Show AllComponents");
        Thread.sleep(1000);

        //3.3 Verify the text ‘Components’
        componentPage.verifyComponentsText();
        Thread.sleep(1000);
    }

}

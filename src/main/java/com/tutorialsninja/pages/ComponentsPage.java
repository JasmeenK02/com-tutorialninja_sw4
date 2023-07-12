package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import sun.java2d.pipe.TextPipe;

public class ComponentsPage extends Utility {

    By actualComponentText =  By.xpath("//h2[contains(text(),'Components')]");




    //3.3 Verify the text ‘Components’
    public void verifyComponentsText(){
        assertVerifyText(actualComponentText, "Components", "Not navigate to Components page.");
    }
}

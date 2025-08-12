package com.demoqa.pages.elements;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickBtn;

    public ButtonsPage doubleClick() {
        waitAndScroll();

        actions.doubleClick(doubleClickBtn).perform();


        return this;
    }


    @FindBy(id="doubleClickMessage")
    WebElement doubleClickMessage;
    public BasePage verifyDoubleClick(String message) {

        Assertions.assertTrue(shouldHaveText(doubleClickMessage,message,5));
        return this;
    }


    @FindBy(id="rightClickBtn")
    WebElement rightClickBtn;
    public BasePage rightClick() {

        waitAndScroll();
        actions.contextClick(rightClickBtn).perform();

        return this;
    }
}

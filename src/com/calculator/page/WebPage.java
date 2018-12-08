package com.calculator.page;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.calculator.utils.Logger;

public class WebPage {

    private static Integer TIME_OUT = 20;
    private FluentWait<WebDriver> mWait;
    protected WebDriver mDriver;

    public WebPage(WebDriver driver) {
        Logger.Debug("launching page ");
        PageFactory.initElements(driver, this);
        mWait = new FluentWait<WebDriver>(driver).withTimeout(TIME_OUT, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        mDriver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    protected void clickElement(String cssSelector) {
        Logger.Debug("clicking element [" + cssSelector + "]");
        WebElement element = mDriver.findElement(By.cssSelector(cssSelector));
        mWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void verifyElementVisible(String cssSelector) {
        Logger.Debug("verifying element [" + cssSelector + "] visible ");
        mWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    protected void verifyElementText(String cssSelector, String value) {
        Logger.Debug("verifying element value to be [" + value + "]");
        WebElement element = mDriver.findElement(By.cssSelector(cssSelector));
        String text = element.getText();
        Assert.assertEquals(text.toLowerCase(), value.toLowerCase());
    }

}

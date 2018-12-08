package com.calculator.page;

import org.openqa.selenium.WebDriver;
import com.calculator.utils.PageProperties;
import com.calculator.utils.PageProperties.Calculator;

public class CalculatorPage extends WebPage {
    Calculator mProp;

    public CalculatorPage(WebDriver driver,PageProperties properties) {
        super(driver);
        mProp = properties.calculator;
    }

    public void clickButtonOne() {
        clickElement(mProp.buttonOne);
    }
    
    public void clickButtonTwo() {
        clickElement(mProp.buttonTwo);
    }
    
    public void clickButtonThree() {
        clickElement(mProp.buttonThree);
    }
    
    public void clickButtonFour() {
        clickElement(mProp.buttonFour);
    }
    
    public void clickButtonFive() {
        clickElement(mProp.buttonFive);
    }
    
    public void clickButtonSix() {
        clickElement(mProp.buttonSix);
    }
    
    public void clickButtonSeven() {
        clickElement(mProp.buttonSeven);
    }
    
    public void clickButtonEight() {
        clickElement(mProp.buttonEight);
    }
    
    public void clickButtonNine() {
        clickElement(mProp.buttonNine);
    }
    
    public void clickButtonZero() {
        clickElement(mProp.buttonZero);
    }
  
    public void clickButtonEQ() {
        clickElement(mProp.buttonEQ);
    }
    
    public void clickButtonPlus() {
        clickElement(mProp.buttonPlus);
    }
    
    public void clickButtonMinus() {
        clickElement(mProp.buttonMinus);
    }
    
    public void clickButtonMulti() {
        clickElement(mProp.buttonMulti);
    }
    
    public void clickButtonDiv() {
        clickElement(mProp.buttonDiv);
    }
    
    public void clickButtonDel() {
        clickElement(mProp.buttonDEL);
    }
    
    public void verifyErrorMessageVisible() {
        verifyElementVisible(mProp.outputResult);
    }
    
    public void verifyErrorMessage(String cssSelector) {
        verifyElementVisible(mProp.outputResult);
        verifyElementText(cssSelector, "ERR");
    }

    public void verifyResult(String expectedResult) {
    	verifyElementText(mProp.outputResult, expectedResult);
    }

}

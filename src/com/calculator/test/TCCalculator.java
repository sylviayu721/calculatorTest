package com.calculator.test;

import org.testng.annotations.Test;

import com.calculator.page.CalculatorPage;
import com.calculator.utils.Logger;


//@Listeners(TestListener.class)
@Test(groups = { "Smoke" })
public class TCCalculator extends TCBase {
    /**
     * Smoke Test case 001 : verify 1 + 1 = 2;
     */
    @Test(groups = { "Smoke", "plus" }, description = "<br>verify 1 + 1 = 2;<br>")
    public void TCCalculator_Smoke001_VerifyOnePlusTwo() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonPlus();
        calculatorPage.clickButtonTwo();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("3");
        //clear result
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        Logger.Debug("finish");
    }
    
    /**
     * Smoke Test case 002 : verify 9 - 3 = 6;
     */
    @Test(groups = { "Smoke", "minus" }, description = "<br>verify 9 - 3 = 6;<br>")
    public void TCCalculator_Smoke002_VerifyNineMinusThree() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonMinus();
        calculatorPage.clickButtonThree();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("6");
        //clear result
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        Logger.Debug("finish");
    }
    
    /**
     * Smoke Test case 003 : verify 4 * 5 = 20;
     */
    @Test(groups = { "Smoke", "multi" }, description = "<br>verify 4 * 5 = 20;<br>")
    public void TCCalculator_Smoke003_VerifyFourMultiFive() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonMulti();
        calculatorPage.clickButtonFive();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("20");
        //clear result
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        Logger.Debug("finish");
    }
    
    /**
     * Smoke Test case 004 : verify 8 / 4 = 2;
     */
    @Test(groups = { "Smoke", "div" }, description = "<br>verify 8 / 4 = 2;<br>")
    public void TCCalculator_Smoke004_VerifyEightDivFour() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonEight();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("2");
        //clear result
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        calculatorPage.clickButtonDel();
        Logger.Debug("finish");
    }
    
    /**
     * Smoke Test case 005 : verify 7*1+6/2-0 = 10
     */
    @Test(groups = { "Smoke", "mix" }, description = "<br>verify 7*1+6/2-0 = 10 <br>")
    public void TCCalculator_Smoke005_VerifySevenMultOnePlusSixDivTwoMinusZero() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonSeven();
        calculatorPage.clickButtonMulti();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonPlus();
        calculatorPage.clickButtonSix();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonTwo();
        calculatorPage.clickButtonMinus();
        calculatorPage.clickButtonZero();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("10");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 001 : verify 12*34+56/7=416;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 12*34+56/7=416;<br>")
    public void TCCalculator_Regression001_VerifyMixOperation1() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonTwo();
        calculatorPage.clickButtonMulti();
        calculatorPage.clickButtonThree();
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonPlus();
        calculatorPage.clickButtonFive();
        calculatorPage.clickButtonSix();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonSeven();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("416");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 002 : verify 78*19-46/23=1480;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 78*19-46/23=1480;<br>")
    public void TCCalculator_Regression002_VerifyMixOperation2() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonSeven();
        calculatorPage.clickButtonEight();
        calculatorPage.clickButtonMulti();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonMinus();
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonSix();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonTwo();
        calculatorPage.clickButtonThree();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("1480");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 003 : verify 99/3/11=3;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 99/3/11=3;<br>")
    public void TCCalculator_Regression003_VerifyMixOperation3() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonThree();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("3");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 004 : verify 71*8=568;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 71*8=568;;<br>")
    public void TCCalculator_Regression004_VerifyMixOperation4() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonSeven();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonMulti();
        calculatorPage.clickButtonEight();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("568");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 005 : verify 61-1-4=56;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 61-1-4=56;<br>")
    public void TCCalculator_Regression005_VerifyMixOperation5() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonSix();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonMinus();
        calculatorPage.clickButtonOne();
        calculatorPage.clickButtonMinus();
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("56");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 006 : verify 45+4+5=54;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 45+4+5=54;<br>")
    public void TCCalculator_Regression006_VerifyMixOperation6() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonFive();
        calculatorPage.clickButtonPlus();
        calculatorPage.clickButtonFour();
        calculatorPage.clickButtonPlus();
        calculatorPage.clickButtonFive();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("54");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 007 : verify 0/99=0;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 0/99=0;<br>")
    public void TCCalculator_Regression007_VerifyMixOperation7() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonZero();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("0");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 008 : verify 9/0=Infinity;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify 9/0=Infinity;<br>")
    public void TCCalculator_Regression008_VerifyMixOperation8() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);
        calculatorPage.clickButtonNine();
        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonZero();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("Infinity");
        Logger.Debug("finish");
    }
    
    /**
     *Regression Test case 008 : verify 9/0=Infinity;
     */
    @Test(groups = { "Regression", "mix" }, description = "<br>verify error;<br>")
    public void TCCalculator_Regression009_VerifyMixOperation9() throws Exception {
    	_driver.navigate().to(_prop.common.mainUrl);
        CalculatorPage calculatorPage = new CalculatorPage(_driver,_prop);

        calculatorPage.clickButtonDiv();
        calculatorPage.clickButtonEQ();
        calculatorPage.verifyResult("ERR");
        Logger.Debug("finish");
    }
}

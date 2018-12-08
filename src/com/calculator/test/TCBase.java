package com.calculator.test;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.calculator.utils.Logger;
import com.calculator.utils.PageProperties;
import com.calculator.utils.Util;

public abstract class TCBase {
	
	private String CHROME_DRIVER_FILE_PATH = "assets\\chromedriver.exe";
	private static final String _pagePropertiesFileName = "assets\\page_properties.json";
    WebDriver _driver;
    static PageProperties _prop=Util.readPageProperties(_pagePropertiesFileName);  
    
    @BeforeMethod(description = "Getting test Method Name")
    void beforeTest(Method method) throws Exception  {
    	Logger.Debug("Before Method");
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_FILE_PATH);
        _driver = new ChromeDriver();
        Logger.Debug("---Running test case " + method.getName() + "----");
        //_driver.manage().window().maximize();
        _driver.navigate().to(_prop.common.mainUrl);
    }
    
    @AfterMethod(description = "Tear Down method")
    void afterTest(Method method)throws Exception{
    	Logger.Debug("Tear down");
        _driver.quit();
        Logger.Debug("---test case " + method.getName() + " : SUCCEED!!!!----");
    }
}

package com.telran.qa23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp - предусловие
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        // System.getProperty("webdriver.chrome.driver", "C:/Tool/chromedriver.exe");
        // driver = new FirefoxDriver();
        //driver = new SafariDriver();
        driver.get("https://www.google.com/");
    }

    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!");
    }

    //after - tearDown - чем завершается тест
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

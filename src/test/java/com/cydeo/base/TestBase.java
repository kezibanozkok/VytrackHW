package com.cydeo.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;


    @BeforeMethod
    public void setUp(@Optional String env){

        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));

    }
}

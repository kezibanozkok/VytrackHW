package com.techcrunch.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = Driver.get();

        driver.manage().window().maximize();

        driver.get(ConfigurationReader.get("url2"));

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}

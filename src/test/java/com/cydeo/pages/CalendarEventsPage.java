package com.cydeo.pages;

import com.cydeo.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Options')]")
    public WebElement option;


    @FindBy(xpath = "//input[@type= 'number']")
    public WebElement pageNumber;

}

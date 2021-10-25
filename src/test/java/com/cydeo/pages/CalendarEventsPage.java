package com.cydeo.pages;

import com.cydeo.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Options')]")
    public WebElement option;


    @FindBy(xpath = "//input[@type= 'number']")
    public WebElement pageNumber;

    @FindBy(css = "div.btn-group > button")
    public WebElement viewPerPage;

    @FindBy(xpath = "//label[@class='dib'][contains(text(), 'Total of ')]")
    public WebElement numOfRecords;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableRows;

    @FindBy(css = ".btn.btn-default.btn-small.dropdown-toggle>input")
    public WebElement selectAllCheckbox;

    @FindBy(css = ".select-row-cell.renderable.grid-cell.grid-body-cell.grid-body-cell-massAction>input")
    public List<WebElement> tableCheckboxes;

    @FindBy(xpath = "//*[. = 'Testers Meeting'] ")
    public WebElement testersMeeting;

    @FindBy(xpath = "//div[@class='responsive-block']/div")
    public List<WebElement> testersMeetingInfo;
}

package com.techcrunch.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(css = ".river.river--homepage article span[class='river-byline__authors']")
    public List<WebElement> authors;

    @FindBy(css = ".river.river--homepage article img")
    public List<WebElement> images;

    @FindBy(css = ".river.river--homepage header[class='post-block__header']")
    public List<WebElement> titles;

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}

package com.techcrunch.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleDetailPage {

    @FindBy(css = ".article__title")
    public WebElement title;

    public ArticleDetailPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}

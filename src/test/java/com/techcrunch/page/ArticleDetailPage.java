package com.techcrunch.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ArticleDetailPage {

    @FindBy(css = ".article__title")
    public WebElement title;

    @FindBy(xpath = "//div[@class='article-content']//a")
    public List<WebElement> links;

    public ArticleDetailPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}

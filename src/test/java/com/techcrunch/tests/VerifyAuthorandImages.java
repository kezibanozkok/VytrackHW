package com.techcrunch.tests;

import com.cydeo.utilities.Driver;
import com.techcrunch.base.TestBase;
import com.techcrunch.page.ArticleDetailPage;
import com.techcrunch.page.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAuthorandImages extends TestBase {

    @Test
    public void test() {

        HomePage homePage = new HomePage();
        ArticleDetailPage articleDetailPage = new ArticleDetailPage();


        for (WebElement author: homePage.authors) {
            Assert.assertTrue(author.isDisplayed(), "verify each article has an author");
        }

        for (WebElement image: homePage.images) {
            Assert.assertTrue(image.isDisplayed(), "verify each article has an image");
        }

        //Assert.assertTrue(homePage.authors.size()==homePage.images.size(), "size not equal");

        homePage.titles.get(0).click();

        String browserTitle = Driver.get().getTitle();
        String pageTitle = articleDetailPage.title.getText();


        Assert.assertTrue(browserTitle.contains(pageTitle), "browser title and page title are NOT same");






    }
}

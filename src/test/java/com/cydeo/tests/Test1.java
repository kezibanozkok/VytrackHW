package com.cydeo.tests;

import com.cydeo.base.TestBase;
import com.cydeo.pages.LoginPage;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void test1() {

        loginPage.loginAsStoreManager();



    }
}

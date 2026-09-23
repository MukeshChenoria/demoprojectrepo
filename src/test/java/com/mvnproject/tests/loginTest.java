package com.mvnproject.tests;
import com.mvnproject.base.PageBase;
import org.testng.annotations.*;
import com.mvnproject.pages.LoginPage;
import org.testng.Assert;
import com.mvnproject.utilities.TestData;

public class loginTest extends PageBase{

    @Test(description = "Login to the application")
    public void loginToApplication() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(TestData.getValue("username"), TestData.getValue("password"));
        Assert.assertEquals(driver.getCurrentUrl(), TestData.getValue("urlHomePage"));
    }
}
package com.mvnproject.tests;
import com.mvnproject.base.PageBase;
import org.testng.annotations.*;
import com.mvnproject.pages.LoginPage;
import com.mvnproject.pages.AboutPage;
import org.testng.Assert;
import com.mvnproject.utilities.TestData;

public class AboutPageTest extends PageBase{

    @Test(description = "Navigate to the About page")
    public void navigateToAboutPage() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        AboutPage aboutPage = new AboutPage(driver);
        loginPage.loginToApplication(TestData.getValue("username"), TestData.getValue("password"));
        aboutPage.navigateToAboutPage();
    }
}
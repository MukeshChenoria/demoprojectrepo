package com.mvnproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.mvnproject.utilities.WaitUtils;

public class AboutPage {
    private final WebDriver driver;
    private final WaitUtils wait;

    private final By hamburgerMenu = By.id("react-burger-menu-btn");
    private final By aboutLink = By.id("about_sidebar_link");
    private final By AboutPageText = By.xpath("//h1[contains(text(), \"Verify AI-generated code at the pace it's written\")]");

    public AboutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    public void navigateToAboutPage() throws InterruptedException {
        driver.findElement(hamburgerMenu).click();
        wait.waitForElementToBeClickable(aboutLink).click();
        driver.findElement(AboutPageText).isDisplayed();
    }

}
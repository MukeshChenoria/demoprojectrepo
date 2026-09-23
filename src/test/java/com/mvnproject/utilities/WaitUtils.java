package com.mvnproject.utilities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitUtils {

    private WebDriver driver;
    private FluentWait<WebDriver> wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;

        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);
    }

    public WebElement waitForElementToBeClickable(By locator) {

        return wait.until(
            ExpectedConditions.elementToBeClickable(locator)
        );
    }
}
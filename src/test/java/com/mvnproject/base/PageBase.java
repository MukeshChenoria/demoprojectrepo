package com.mvnproject.base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.mvnproject.utilities.TestData;

public class PageBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("profile.password_manager_leak_detection", false);
    options.setExperimentalOption("prefs", prefs);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(TestData.getValue("urlHomePage"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
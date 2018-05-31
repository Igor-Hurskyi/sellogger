package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.objects.MainPage;

public class SimpleTest {

    private String baseUrl;
    private WebDriver driver;

    @BeforeTest
    private void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        baseUrl = "http://www.webpagetest.org";
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    private void simpleAssert() throws InterruptedException {
        MainPage mp = new MainPage(driver);

        mp.switchToEasyMode();
        mp.typeToSearchbox("facebook.com");
        mp.clickOnSearchButton();
        Thread.sleep(5000);

        Assert.assertEquals(true, true);
    }

    @AfterTest
    private void closeBrowser() {
        driver.quit();
    }

}

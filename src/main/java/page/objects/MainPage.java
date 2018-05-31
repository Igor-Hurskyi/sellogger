package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {

    @FindBy(id = "url")
    private WebElement websiteUrlTextbox;

    @FindBy(className = "start_test")
    private WebElement startTestButton;

    @FindBy(className="easy_mode")
    private WebElement easyModeButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeToSearchbox(String webSiteUrl) {
        logger.info("Typing into websiteUrlTextbox: " + webSiteUrl);
        websiteUrlTextbox.sendKeys(webSiteUrl);
    }

    public void clickOnSearchButton() {
        logger.info("Starting test...");
        startTestButton.click();
    }

    public void switchToEasyMode() {
        logger.info("Switching to easy mode...");
        easyModeButton.click();
    }

}

package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {

    @FindBy(id = "url")
    private WebElement searchBox;

    @FindBy(className = "start_test")
    private WebElement searchButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeToSearchbox(String webSiteUrl) {
        logger.info("Typing into searchBox: " + webSiteUrl);
        searchBox.sendKeys(webSiteUrl);
    }

    public void clickOnSearchButton() {
        logger.info("Clicking on a search Button");
        searchButton.click();
    }

}

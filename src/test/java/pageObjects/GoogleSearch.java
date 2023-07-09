package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
    @FindBy(xpath = "//*[@id=\"L2AGLb\"]/div")
    private WebElement googleSearchAcceptButton;
    @FindBy(xpath = "//*[@id=\"APjFqb\"]")
    private WebElement googleSearchBar;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")
    private WebElement googleSearchImageButton;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/button")
    private WebElement runSearchImageMagnifier;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div[1]/div/div[1]/div[1]/div/div/a[2]")
    private WebElement videoButton;

    @FindBy(xpath = "//*[@id=\"hdtb-tls\"]")
    private WebElement runInstruments;


    public GoogleSearch(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void acceptConsentClick() {

        googleSearchAcceptButton.click();
    }

    public void writeToSearchBar(String string) {

        googleSearchBar.sendKeys(string);
    }

    public void clickGoogleSearchButton() {

        googleSearchButton.click();
    }

    public void runSearchImagesButton() {

        googleSearchImageButton.click();
    }

    public void runSearchImageMagnifier() {

        runSearchImageMagnifier.click();
    }

    public void clickOnSearchVideoButton() {

        videoButton.click();
    }

    public void clickOnInstruments() {

        runInstruments.click();
    }
}

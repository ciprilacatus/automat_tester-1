package org.example;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.GoogleSearch;


public class StepDefinitions {

    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    private GoogleSearch googleSearch;

    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        googleSearch = new GoogleSearch(driver);


    }

    @Given("I am on the google search page")
    public void googleSearchPageAction() {
        driver.get("https://www.google.com");
        googleSearch.acceptConsentClick();
    }

    @When("the search therm of {string} is written")
    public void writenToSearchBox(String string) {
        googleSearch.writeToSearchBar(string);
    }

    @When("the image button is clicked")
    public void runSearchImagesButton() {
        googleSearch.runSearchImagesButton();
    }

    @And("the search button is clicked")
    public void clickSearchButton() {
        googleSearch.clickGoogleSearchButton();
    }
    @And("the magnifier is clicked")
    public void clicOnMagnifire(){
        googleSearch.runSearchImageMagnifier();
    }

    @And("then i click on video button")
    public void clickTheVideoButton() {
        googleSearch.clickOnSearchVideoButton();
    }

    @And("i click on Instruments button")
        public void clickInstrumentsButton() {
        googleSearch.clickOnInstruments();
    }


    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

//    @After
//    public void cleanUp() {
//        driver.quit();
//    }

}

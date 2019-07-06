package lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private final WebDriver driver;

    private By searchButton = By.xpath("//*[@name=\"submit_search\"]");
    private By searchBar = By.id("search_query_top");



    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public SearchPage searchBarEnterText(String s) {
        this.driver.findElement(searchBar).sendKeys(s);
        this.driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }
}
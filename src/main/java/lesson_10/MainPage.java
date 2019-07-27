package lesson_10;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    @FindBy(xpath="//*[@name=\"submit_search\"]")
    WebElement searchButton;

    @FindBy(id="search_query_top")
    WebElement searchBar;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public MainPage openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public SearchPage searchBarEnterText(String s) {
        searchBar.sendKeys(s);
        searchButton.click();
        return new SearchPage(driver);
    }
}
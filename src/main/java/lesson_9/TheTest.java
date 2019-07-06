package lesson_9;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TheTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.mainPage = new MainPage(this.driver);
    }

    @Test
    public void checkTotals() {
        mainPage.openMainPage();
        SearchPage searchPage = mainPage.searchBarEnterText("Blouse");
        CartPage cartPage = searchPage.addToCartFromListView();
        cartPage.addOne();
        driver.navigate().refresh();

        Assert.assertEquals(cartPage.totalProducts().getText(),"$54.00");
        Assert.assertEquals(cartPage.totalShipping().getText(),"$2.00");
        Assert.assertEquals(cartPage.totalWithoutTax().getText(),"$56.00");
        Assert.assertEquals(cartPage.totalTax().getText(),"$0.00");
        Assert.assertEquals(cartPage.total().getText(),"$56.00");

    }

    @Test
    public void checkEmptyCartMessage() {
        mainPage.openMainPage();
        SearchPage searchPage = mainPage.searchBarEnterText("Blouse");
        CartPage cartPage = searchPage.addToCartFromListView();
        cartPage.addOne();
        cartPage.deleteProduct();

        Assert.assertTrue(cartPage.emptyRateCard().isEnabled());
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}

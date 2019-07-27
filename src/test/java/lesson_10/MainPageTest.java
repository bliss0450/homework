package lesson_10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = WebDriverFactory.getDriver(DrvierType.CHROME);
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void checkTotals() {
        MainPage mainPage = new MainPage(driver);
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
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SearchPage searchPage = mainPage.searchBarEnterText("Blouse");
        CartPage cartPage = searchPage.addToCartFromListView();
        cartPage.addOne();
        cartPage.deleteProduct();

        Assert.assertTrue(cartPage.emptyRateCard().isEnabled());
    }
}

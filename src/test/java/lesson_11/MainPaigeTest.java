package lesson_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPaigeTest {
    private ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public CartPage getToCart(ChromeDriver driver) {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SearchPage searchPage = mainPage.searchBarEnterText("Blouse");
        CartPage cartPage = searchPage.addToCartFromListView();
        cartPage.addOne();
        driver.navigate().refresh();
        return new CartPage(driver);
    }

    @Test
    public void checkTotalProducts() {
        CartPage cartPage = getToCart(driver);
        Assert.assertEquals(cartPage.totalProducts().getText(),"$54.00");
    }

    @Test
    public void checkTotalShipping() {
        CartPage cartPage = getToCart(driver);

        Assert.assertEquals(cartPage.totalShipping().getText(),"$2.00");
    }

    @Test
    public void checkTotalWithoutTax() {
        CartPage cartPage = getToCart(driver);

        Assert.assertEquals(cartPage.totalWithoutTax().getText(),"$56.00");
    }

    @Test
    public void checkTotalTax() {
        CartPage cartPage = getToCart(driver);

        Assert.assertEquals(cartPage.totalTax().getText(),"$0.00");
    }

    @Test
    public void checkTotal() {
        CartPage cartPage = getToCart(driver);

        Assert.assertEquals(cartPage.total().getText(),"$56.00");
    }

    @Test
    public void checkEmptyCartMessage() {
        CartPage cartPage = getToCart(driver);
        cartPage.deleteProduct();

        Assert.assertTrue(cartPage.emptyRateCard().isEnabled());
    }

    @AfterTest
    public void closeWEbDriver() {
        driver.close();
    }
}

package lesson_10;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    @FindBy(xpath="//*[@id=\"list\"]/a/i")
    WebElement listView;

    @FindBy(xpath="//*[@class=\"button ajax_add_to_cart_button btn btn-default\"]")
    WebElement addToCart;

    @FindBy(xpath="//*[@title=\"Proceed to checkout\"]")
    WebElement proceedToCheckout;

    public WebDriver driver;

    public SearchPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public CartPage addToCartFromListView() {
        listView.click();
        addToCart.click();
        proceedToCheckout.click();
        return new CartPage(driver);
    }
}

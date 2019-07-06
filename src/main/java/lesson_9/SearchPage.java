package lesson_9;

import lesson_9.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private By listView = By.xpath("//*[@class=\"icon-th-list\"]");
    private By addToCart = By.xpath("//*[@class=\"button ajax_add_to_cart_button btn btn-default\"]");
    private By proceedToCheckout = By.xpath("//*[@title=\"Proceed to checkout\"]");
    public WebDriver driver;

    public SearchPage (WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage() {

    }

    public CartPage addToCartFromListView() {
        this.driver.findElement(listView).click();
        this.driver.findElement(addToCart).click();
        this.driver.findElement(proceedToCheckout).click();
        return new CartPage(driver);
    }
}

package lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private By plusOne = By.id("cart_quantity_up_2_7_0_0");
    private By delete = By.id("2_7_0_0");
    private By emptyCart = By.cssSelector(".alert.alert-warning");
    private By totalProducts = By.id("total_product");
    private By totalShipping = By.id("total_shipping");
    private By totalNoTax = By.id("total_price_without_tax");
    private By totalTax = By.id("total_tax");
    private By totalPrice = By.id("total_price");

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addOne() {
        this.driver.findElement(plusOne).click();
        return new CartPage(driver);
    }

    public CartPage deleteProduct() {
        this.driver.findElement(delete).click();
        return new CartPage(driver);
    }

    public WebElement emptyRateCard() {
        return this.driver.findElement(emptyCart);
    }

    public WebElement totalProducts() {
        return this.driver.findElement(totalProducts);
    }

    public WebElement totalShipping() {
        return this.driver.findElement(totalShipping);
    }

    public WebElement totalWithoutTax() {
        return this.driver.findElement(totalNoTax);
    }

    public WebElement totalTax() {
        return this.driver.findElement(totalTax);
    }

    public WebElement total() {
        return this.driver.findElement(totalPrice);
    }
}

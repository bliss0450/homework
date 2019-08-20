package lesson_11;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author a.lemeshchuk
 */
public class CartPage {
    
    @FindBy(xpath="//*[@id=\"cart_quantity_up_2_7_0_0\"]")
    WebElement plusOne;

    @FindBy(id="2_7_0_0")
    WebElement delete;

    @FindBy(css=".alert.alert-warning")
    WebElement emptyCart;

    @FindBy(id="total_product")
    WebElement totalProducts;

    @FindBy(id="total_shipping")
    WebElement totalShipping;

    @FindBy(id="total_price_without_tax")
    WebElement totalNoTax;

    @FindBy(id="total_tax")
    WebElement totalTax;

    @FindBy(id="total_price")
    WebElement totalPrice;

    private ChromeDriver driver;

    public CartPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public CartPage addOne() {
        plusOne.click();
        return new CartPage(driver);
    }

    public CartPage deleteProduct() {
        delete.click();
        return new CartPage(driver);
    }

    public WebElement emptyRateCard() {
        return emptyCart;
    }

    public WebElement totalProducts() {
        return totalProducts;
    }

    public WebElement totalShipping() {
        return totalShipping;
    }

    public WebElement totalWithoutTax() {
        return totalNoTax;
    }

    public WebElement totalTax() {
        return totalTax;
    }

    public WebElement total() {
        return totalPrice;
    }
}

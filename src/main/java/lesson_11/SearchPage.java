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
public class SearchPage {
    
    @FindBy(xpath="//*[@id=\"list\"]/a/i")
    WebElement listView;

    @FindBy(xpath="//*[@class=\"button ajax_add_to_cart_button btn btn-default\"]")
    WebElement addToCart;

    @FindBy(xpath="//*[@title=\"Proceed to checkout\"]")
    WebElement proceedToCheckout;

    public ChromeDriver driver;

    public SearchPage (ChromeDriver driver) {
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

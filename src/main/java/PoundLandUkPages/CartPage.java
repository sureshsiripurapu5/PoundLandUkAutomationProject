package PoundLandUkPages;

import Utilities.PoundLandSeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage {

    PoundLandSeleniumActions seleniumActions;
    public CartPage(WebDriver driver){
        seleniumActions=new PoundLandSeleniumActions(driver);
    }

    @FindBy(xpath = "//span[@class='basket-amount']/span/span[@class='price'])[2]")
    WebElement cartButton;

    @FindBy(xpath = "//div[contains(@class,'item-details')]/strong/a")
    WebElement cartProductTitleText;

    @FindBy(xpath = "//span[@class='cart-price']/span")
    WebElement cartProductPriceText;

    @FindBy(xpath = "//li[@class='action-delete']/a/span[contains(normalize-space(),'Remove')]")
    List<WebElement>removeItemButton; //2

    @FindBy(xpath = "//li[@class='action-edit']/a[@title='Edit item parameters']/span[normalize-space()='Edit']")
    List<WebElement> editItem;

    @FindBy(xpath = "//a[@id='addtowish']/span[text()='Add to favourites']")
    WebElement addToFavouritesButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    WebElement cartModifyProductTitleText;

    @FindBy(xpath = "//div[@data-role='priceBox']")
    WebElement cartModifyProductPriceText;

    @FindBy(xpath = "//a[contains(normalize-space(),'my account')] ")
    WebElement myAccountButton;

    @FindBy(xpath = "//div[@class='top-subnav']/descendant::a[text()='My Favourites']")
    WebElement myFavourites;

    @FindBy(xpath = "//p[@class='productName']/span")
    WebElement favouritesProductTitleText;

    @FindBy(xpath = "//span[@class='product-price']")
    WebElement favouritesProductPriceText;





}

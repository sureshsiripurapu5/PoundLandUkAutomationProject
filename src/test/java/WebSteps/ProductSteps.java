package WebSteps;

import Factory.WebDriverFactory;
import PoundLandUkPages.CartPage;
import PoundLandUkPages.HomePage;
import PoundLandUkPages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductSteps extends WebDriverFactory {

    HomePage homePage;
    ProductsPage productsPage;
    CartPage cartPage;
    String firstProductText;
    String firstProductPrice;
    @Given("the user is on the Home Screen")
    public void theUserIsOnTheHomeScreen() {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        cartPage=new CartPage(driver);
    }

    @And("the user clicks on the Product Search Bar and enters product name in the search bar {string}")
    public void theUserClicksOnTheProductSearchBarAndEntersProductNameInTheSearchBar(String productName) {
        homePage.clickOnCookieButton();
        homePage.clickOnProductSearchBarAndEnterProductName(productName);
    }

    @Given("the user clicks on the Search Icon")
    public void the_user_clicks_on_the_search_icon() {
       homePage.clickOnSearchIcon();
    }



    @Then("the user adds the first item to the Bag")
    public void the_user_adds_the_first_item_to_the_bag() {
        firstProductText=productsPage.getProductText();
        firstProductPrice=productsPage.getProductPrice();
        productsPage.clickOnAddButton();

    }

    @Then("the user clicks on the Product Bag")
    public void the_user_clicks_on_the_product_bag() {
        cartPage.clickOnCartButton();
    }

    @Then("the user verifies the Product Name and Product Price in the Bag")
    public void the_user_verifies_the_product_name_and_product_price_in_the_bag() {
      String cartProductTitle=cartPage.fetchTheProductTitleTextFromTheBag();
      String cartProductPrice= cartPage.fetchTheProductPriceTextFromTheBag();
      Assert.assertEquals(firstProductText,cartProductTitle);
      Assert.assertEquals(firstProductPrice,cartProductPrice);
    }



}

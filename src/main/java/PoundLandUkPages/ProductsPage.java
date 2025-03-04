package PoundLandUkPages;

import Utilities.PoundLandSeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    PoundLandSeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        seleniumActions=new PoundLandSeleniumActions(driver);
    }

    By productText=By.xpath("//span[contains(@class,'item-name')]/a");
    By productPrice=By.xpath("//span[@class='decimal']/../parent::span");
    By addButton=By.xpath("//button[@type='submit' and @title='Add']/span");
    By productsSortingDropDown= By.xpath("//button[@type='button' and @title='Sort By']");
    By sortByProductName=By.xpath("//div[@class='options']/child::a[text()='Product Name']");
    By sortByProductLowToHigh=By.xpath("//div[@class='options']/child::a[text()='Price Low to High']");
    By sortByProductHighToLow=By.xpath("//div[@class='options']/child::a[text()='Price High to Low']");



    public String getProductText(){
        return seleniumActions.getFirstProductData(productText);
    }

    public String getProductPrice(){
        return seleniumActions.getFirstProductData(productPrice);
    }
    public void clickOnAddButton(){
        seleniumActions.clickOnElement(addButton);
    }

    public void clickOnDropDown(){
        seleniumActions.clickOnElement(productsSortingDropDown);
    }

    public void clickOnSortByProductName(){
        seleniumActions.clickOnElement(sortByProductName);
    }

    public void clickOnSortByProductLowToHigh(){
        seleniumActions.clickOnElement(sortByProductLowToHigh);
    }

    public void clickOnProductHighToLow(){
        seleniumActions.clickOnElement(sortByProductHighToLow);
    }

}

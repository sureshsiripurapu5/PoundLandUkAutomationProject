package PoundLandUkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

    @FindBy(xpath = "//a[contains(normalize-space(),'my account')] ")
    WebElement myAccountButton;

    @FindBy(xpath = "//div[@class='top-subnav']/descendant::a[text()='My Favourites']")
    WebElement myFavourites;

    @FindBy(xpath = "//p[@class='productName']/span")
    WebElement favouritesProductTitleText;

    @FindBy(xpath = "//span[@class='product-price']")
    WebElement favouritesProductPriceText;

    By AccountOverView=By.xpath("//div[@class='top-subnav']/descendant::li/a[text()='Account Overview']");
    By editAccountInformation=By.xpath("//a[@class='action edit']/span[text()='Edit Account Information']");
    By editFirstName= By.xpath("//input[@id='firstname' and @name='firstname']");
    By editLastName=By.xpath("//input[@id='lastname' and @name='lastname']");
    By invoiceDropDown=By.xpath("//select[contains(@id,'invoice')]"); //selectByValue 1
    By interestsCheckBoxes=By.xpath("//label[@class='label']/child::input[@type='checkbox']"); //11 checkBoxes
    By preferredStoreDropDown =By.xpath("//select[contains(@id,'preferred')]"); //selectByValue 1509
    By dateOfBirth=By.xpath("//input[@name='dob' and @id='dob']");
    By selectYear=By.xpath("//select[@data-handler='selectYear']"); //selectByVisibleText 2000
    By selectMonth=By.xpath("//select[@data-handler='selectMonth']"); //selectByVisibleTtext Nov
    By saveButton=By.xpath("//button[@type='submit' and @title='Save']");



}

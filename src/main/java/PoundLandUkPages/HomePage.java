package PoundLandUkPages;

import Utilities.PoundLandSeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    PoundLandSeleniumActions seleniumActions;

    public HomePage(WebDriver driver){
        seleniumActions=new PoundLandSeleniumActions(driver);
    }

    By cookieButton=By.xpath("(//button[normalize-space()='Accept All Cookies'])[1]");
    By signInLink=By.xpath("//li[contains(@class,'customer-account')]/a[contains(normalize-space(),'sign in')]");
    By signInButton=By.xpath("//div[@class='primary']/a[text()='Sign In']");
    By emailAddressField=By.xpath("//input[@id='signInName']");
    By passwordField=By.xpath("//input[@id='password']");
    By signIn=By.xpath("//button[@type='submit' and text()='Sign in']");
    By loginStatusMessage=By.xpath("//div[contains(@class,'pageLevel')]/p");
    By homePageLogo=By.xpath("//div[@class='logo-block']/a[@title='Poundland']/img");
    By productSearch=By.xpath("//input[@id='search']");
    By suggestionProduct=By.xpath("(//ul[contains(@id,'acList')]/li/a)[1]");
    By searchIcon=By.xpath("//button[@type='submit' and @title='Search']");

    public void clickOnCookieButton(){
        seleniumActions.clickOnElement(cookieButton);
    }
    public void clickOnProductSearchBarAndEnterProductName(String productName){
        seleniumActions.enterValue(productSearch,productName);
    }
    public void clickOnSuggestionItem(){
        seleniumActions.clickOnElement(suggestionProduct);
    }
    public void clickOnSearchIcon(){
        seleniumActions.clickOnElement(searchIcon);
    }

    public void move(){
        seleniumActions.moveTOElement(productSearch);
    }

    public void clickOnSignInLink(){
        seleniumActions.clickOnElement(signInLink);
    }

    public void clickOnSignInButton(){
        seleniumActions.clickOnElement(signInButton);
    }

    public void clickOnEmailAddressFieldAndEnterData(String data){
        seleniumActions.enterValue(emailAddressField,data);
    }

    public void clickOnPasswordFieldAndEnterData(String data){
        seleniumActions.enterValue(passwordField,data);
    }

    public void clickOnSignIn(){
        seleniumActions.clickOnElement(signIn);
    }

    public boolean isLogoDisplayed(){
        return seleniumActions.homePageLogoIsDisplayedOrNot(homePageLogo);
    }

    public String getLoginCredentialsStatus(){
        return seleniumActions.visibilityOfElementLocatedAndRetriveTheText(loginStatusMessage);
    }
}

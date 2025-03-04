package WebSteps;

import Factory.WebDriverFactory;
import PoundLandUkPages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps extends WebDriverFactory {
    HomePage homePage;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
       homePage=new HomePage(driver);
    }

    @When("The user enters a valid email and password")
    public void theUserEntersAValidEmailAndPassword() {
        homePage.clickOnCookieButton();
        homePage.clickOnSignInLink();
        homePage.clickOnSignInButton();
        homePage.clickOnEmailAddressFieldAndEnterData("siripurapusuresh5@gmail.com");
        homePage.clickOnPasswordFieldAndEnterData("Suresh@123");

    }

    @And("Clicks on the SignIn button")
    public void clicksOnTheSignInButton() throws InterruptedException {
        homePage.clickOnSignIn();

    }

    @Then("The user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
       if(homePage.isLogoDisplayed()){
           System.out.println("User is redirected to PoundLandUk Page");
       }
       else {
           System.out.println("User is Logged With Invalid Credentials");
       }
    }


    @Given("The user is on the SignIn page")
    public void theUserIsOnTheSignInPage() {
        homePage=new HomePage(driver);
    }

    @When("The user enters an valid email {string}")
    public void theUserEntersAnValidEmail(String email) {
        homePage.clickOnCookieButton();
        homePage.clickOnSignInLink();
        homePage.clickOnSignInButton();
        homePage.clickOnEmailAddressFieldAndEnterData(email);
    }


    @And("The user enters the inValidPassword {string}")
    public void theUserEntersTheInValidPassword(String password) {
        homePage.clickOnPasswordFieldAndEnterData(password);
    }


    @Then("An error message {string} should be displayed")
    public void anErrorMessageShouldBeDisplayed(String message)  {

        String errorMessage=homePage.getLoginCredentialsStatus();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage,message);
    }

    @When("The user enters an inValid email {string}")
    public void theUserEntersAnInValidEmail(String email) {
        homePage.clickOnCookieButton();
        homePage.clickOnSignInLink();
        homePage.clickOnSignInButton();
        homePage.clickOnEmailAddressFieldAndEnterData(email);
    }

    @And("The user enters the Valid Password {string}")
    public void theUserEntersTheValidPassword(String password) {
        homePage.clickOnPasswordFieldAndEnterData(password);
    }
}

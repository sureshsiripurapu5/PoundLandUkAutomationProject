package PoundLandUkPages;

import org.openqa.selenium.By;

public class AddressPage {

    By editAddressLink=By.xpath("//a[@class='action edit']/span[text()='Edit Address']"); //multiple elements select 1
    By companyInputField=By.xpath("//input[@id='company']");
    By telephoneField=By.xpath("//input[@id='telephone']");
    By postCodeField=By.xpath("//input[@id='zip']");
    By streetAddressField=By.xpath("//input[@id='street_1']");
    By countryField=By.xpath("//input[@id='region']");
    By cityField=By.xpath("//input[@id='city']");
    By countryDropDown=By.xpath("//select[@id='country']"); //selectByVisibleText Germany
}

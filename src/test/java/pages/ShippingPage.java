package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShippingPage extends BasePage {

    MyCartPage myCartPage = new MyCartPage();

    public String url = "https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=";
    public String customer_nameText="AAA";
    public String phone_Number = "0123456789";
    public String countryName = "Bangladesh";
    public String cityName = "খুলনা";
    public String areaName = "ডুমুরিয়া";
    public String addressText = "Writdfdrfhfg";

    public By customer_name = By.xpath("(//input[@id='name'])[1]");
    public By phoneNumber = By.id("phone");
    public By selectCountry = By.name("countryId");
    public By selectCity = By.name("cityId");
    public By selectArea = By.name("areaId");
    public By address = By.cssSelector("#address");
    public By paymentMethod = By.xpath("//label[@for='COD']");


    public void goToShippingPage(){

        myCartPage.clickOnElement(myCartPage.placeOrderButton);
    }







}
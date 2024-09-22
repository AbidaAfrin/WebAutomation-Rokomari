package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserSetup;

public class TestShippingPage extends BrowserSetup {
    NavBarPage navBarPage = new NavBarPage();
    ShippingPage shippingPage = new ShippingPage();
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    TestLogin testLogin = new TestLogin();
    TestSelectProduct testSelectProduct = new TestSelectProduct();
    MyCartPage myCartPage= new MyCartPage();

@Test(description = "Shipping Page Test")
    @Description(" Test Description:This test will try to browse the shipping page and" +
            "then fill up the shipping info")
    public void fillUpShippingForm(){


        shippingPage.goToShippingPage(); //place order
        shippingPage.writeOnElement(shippingPage.customer_name,shippingPage.customer_nameText);
        shippingPage.writeOnElement(shippingPage.phoneNumber,shippingPage.phone_Number);
        shippingPage.clickOnElement(shippingPage.selectCountry);
        shippingPage.selectItem(shippingPage.selectCountry,shippingPage.countryName);
        shippingPage.clickOnElement(shippingPage.selectCity);
        shippingPage.selectItem(shippingPage.selectCity,shippingPage.cityName);
        shippingPage.clickOnElement(shippingPage.selectArea);
        shippingPage.selectItem(shippingPage.selectArea,shippingPage.areaName);
        shippingPage.writeOnElement(shippingPage.address,shippingPage.addressText);
        shippingPage.addScreenshot("Shipping Page after filling the required info");
        shippingPage.scroll(shippingPage.paymentMethod);
        shippingPage.clickOnElement(shippingPage.paymentMethod);




    }
}

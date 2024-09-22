package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyCartPage;
import utilities.BrowserSetup;

public class TestMyCartPage extends BrowserSetup {
    MyCartPage myCartPage = new MyCartPage();


    @Test(description = "My Cart Page")
    @Description("This test will try to go to my cart page")
    public void myCartPage(){
        myCartPage.goToMyCartPage();
        myCartPage.addScreenshot("My Cart Page");

    }

}

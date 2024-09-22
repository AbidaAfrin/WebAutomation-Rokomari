package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyCartPage;
import pages.ProductPage;
import pages.SignInPage;
import utilities.BrowserSetup;

public class TestSelectProduct extends BrowserSetup {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    ProductPage productPage = new ProductPage();
    MyCartPage myCartPage = new MyCartPage();

@Test(description = "Select a book after filtering writer and categories")
@Description(" Test Description : This test will try to select a specific writer," +
        "filter based on two categories,go to next page and selects a book")
    public void selectProduct()  {
        productPage.selectWriter();
        productPage.addScreenshot("Humayun Ahmed Books Collection");


        productPage.filterByCategories();
        productPage.addScreenshot("Humayun Ahmed Books Collection after Filter");

        productPage.scrollToGoToNextPage();
        productPage.addScreenshot("Humayun Ahmed Books Collection 2nd page");

        //Thread.sleep(3000);
        productPage.selectBook();
        productPage.addScreenshot("After selecting a book");
        //Thread.sleep(2000);
//        myCartPage.GoToMyCartPage();

    }


}

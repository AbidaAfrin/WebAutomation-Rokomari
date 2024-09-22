package pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;


import static utilities.BrowserSetup.getBrowser;

public class ProductPage extends BasePage {
    HomePage homePage = new HomePage();





    public By filterCategoriesList = By.cssSelector("#js--categoryIds");
    public By option1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By option2 = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
    // public By scrollDown = By.xpath("//footer[@class='large-footer']");
    public By pagination = By.className("pagination");
    public By nextPageButton = By.xpath("//a[normalize-space()='Next']");
 //   public By page2 = By.cssSelector(".current");
    public By product = By.xpath("//div[@title='অন্যদিন হুমায়ূন আহমেদ']");
    public By addToCart = By.cssSelector(".btn.cart-btn.js--add-to-cart[product-id='1196']");
  //  public By cart = By.cssSelector("img[alt='cart']");




    public void selectWriter(){
      //  getBrowser().get(homePage.url);

        homePage.hover(homePage.writerButton);
        homePage.clickOnElement(homePage.writerName);

    }

    public void filterByCategories(){

        scroll(filterCategoriesList);
        clickOnElement(option1);
        scroll(filterCategoriesList);
        clickOnElement(option2);
        scroll(filterCategoriesList);
    }

    public void scrollToGoToNextPage()  {
        scroll(pagination);
        clickOnElement(nextPageButton);
       // navBarPage.scroll(navBarPage.pagination);
    }



    public void selectBook()  {

        scroll(product);
        hover(product);
        clickOnElement((addToCart));
    }


}

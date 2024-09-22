package pages;

import org.openqa.selenium.By;

public class NavBarPage extends BasePage {
    public String url = "https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0";

    public By filterCategoriesList = By.cssSelector("#js--categoryIds");
    public By option1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By option2 = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
   // public By scrolldown = By.xpath("//footer[@class='large-footer']");
    public By pagination = By.className("pagination");
    public By nextPageButton = By.xpath("//a[normalize-space()='Next']");
    public By page2 = By.cssSelector(".current");
    public By product = By.xpath("//div[@title='কিছুক্ষণ হুমায়ূন আহমেদ']");
    public By addToCart = By.cssSelector("button[product-id='1218']");
    public By cart = By.cssSelector("img[alt='cart']");

}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyWishListScreen {
    @FindBy(how= How.LINK_TEXT, using = "TOP SELLERS")
    public static WebElement TopSellers;

    @FindBy(how= How.XPATH, using = "//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/a")
    public static WebElement TopSellersFirstItem;


    @FindBy(how= How.LINK_TEXT, using = "My wishlist")
    public static WebElement Mywishlist;

    @FindBy(how= How.CLASS_NAME, using = "product_image")
    public static WebElement MywishlistItem;


    public void verifyTopSellersIsDisplayed(){TopSellers.isDisplayed();}
    public void ClickFirstItem(){TopSellersFirstItem.click();}
    public void ClickMyWishlist(){Mywishlist.click();}
    public void VerifyMyWishListItem(){MywishlistItem.isDisplayed();}


}

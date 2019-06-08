package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyDashboardScreen {

    @FindBy(how= How.CLASS_NAME,using = "page-heading")
    public static WebElement MyAccount;

    @FindBy(how= How.LINK_TEXT,using = "MY WISHLISTS")
    public static WebElement MYWISHLISTS;

    @FindBy(how= How.LINK_TEXT,using = "Jeff Joe")
    public static WebElement JeffJoe;

    @FindBy(how= How.LINK_TEXT,using = "Sign out")
    public static WebElement SignOut;



    public void verifyRegSuccess(){MyAccount.isDisplayed();}
    public void verifywishlistisdisplayed(){MYWISHLISTS.isDisplayed();}
    public void ClickMyWishLists(){MYWISHLISTS.click();}
    public void clickUserLinkText(){JeffJoe.click();}
    public void ClickSignOut(){SignOut.click();}
}

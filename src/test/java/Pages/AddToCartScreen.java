package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartScreen {
    @FindBy(how= How.ID, using = "wishlist_button")
    public static WebElement AddToWishList;

    @FindBy(how= How.XPATH, using = "//*[@id=\"product\"]/div[2]/div/div/a")
    public static WebElement CloseSuccessMessage;

    public void ClickAddToWishList(){AddToWishList.click();}
    public void CloseSuccesMessage(){CloseSuccessMessage.click();}
}

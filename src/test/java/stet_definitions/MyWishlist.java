package stet_definitions;

import Base.TestBase;
import Pages.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyWishlist extends TestBase {
    public int random;

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the application homescreen$")
    public void i_am_on_the_application_homescreen() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Given("^I Click Sign In$")
    public void i_Click_Sign_In() throws Throwable {
        HomeScreen page = PageFactory.initElements(driver, HomeScreen.class);
        page.ClickSignIn();
    }

    @Given("^I successfully register account being navigated to my homepage$")
    public void i_successfully_register_account_being_navigated_to_my_homepage() throws Throwable {
        Login_CreateAccPage page = PageFactory.initElements(driver, Login_CreateAccPage.class);
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));

        driver.findElement(By.name("email_create")).sendKeys("lanre.ikuesan"+ random + "@praoctis.com");
        //page.typeCreateEmail();
        page.ClickCreate();

        CreateAccPage Page = PageFactory.initElements(driver, CreateAccPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Page.SelectGender();
        Page.TypeFirstname();
        Page.TypeLastName();
        Page.TypePassword();
        Page.TypeAddress();
        Page.TypeCity();
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
        Page.TypePostcode();
        Page.TypeMobilePhone();
        Page.ClearAliasField();
        Page.TypeAlias();
        Page.clickRegister();
        MyDashboardScreen screen = PageFactory.initElements(driver, MyDashboardScreen.class);
        screen.verifyRegSuccess();

    }

    @Given("^I see LinkText My Wishlist is displayed$")
    public void i_see_LinkText_My_Wishlist_is_displayed() throws Throwable {
        MyDashboardScreen screen = PageFactory.initElements(driver, MyDashboardScreen.class);
        screen.verifywishlistisdisplayed();

    }

    @When("^I Click on LinkText My Wishlist$")
    public void i_Click_on_LinkText_My_Wishlist() throws Throwable {
        MyDashboardScreen screen = PageFactory.initElements(driver, MyDashboardScreen.class);
        screen.ClickMyWishLists();

    }

    @When("^I see Top Sellers list on left hand panel$")
    public void i_see_Top_Sellers_list_on_left_hand_panel() throws Throwable {
        MyWishListScreen screen = PageFactory.initElements(driver, MyWishListScreen.class);
        screen.verifyTopSellersIsDisplayed();
    }

    @When("^I Click the first item on the Top Sellers list$")
    public void i_Click_the_first_item_on_the_Top_Sellers_list() throws Throwable {
        MyWishListScreen screen = PageFactory.initElements(driver, MyWishListScreen.class);
        screen.ClickFirstItem();
    }

    @When("^I add selected item to my wishlist$")
    public void i_add_selected_item_to_my_wishlist() throws Throwable {
        AddToCartScreen screen = PageFactory.initElements(driver, AddToCartScreen.class);
        screen.ClickAddToWishList();

    }

    @When("^I get a confirmation message that Item is added to wish list$")
    public void i_get_a_confirmation_message_that_Item_is_added_to_wish_list() throws Throwable {
        String ExpectedMessage ="Added to your wishlist.";
        String Actualmessage =driver.findElement(By.className("fancybox-error")).getText();
        Assert.assertEquals(ExpectedMessage, Actualmessage);
        System.out.print(Actualmessage);

        AddToCartScreen screen = PageFactory.initElements(driver, AddToCartScreen.class);
        screen.CloseSuccesMessage();


    }

    @When("^I view my wishlist page$")
    public void i_view_my_wishlist_page() throws Throwable {
        MyDashboardScreen screen = PageFactory.initElements(driver, MyDashboardScreen.class);
        screen.clickUserLinkText();
        screen.ClickMyWishLists();

    }

    @Then("^Item should be displayed on my wishlist$")
    public void item_should_be_displayed_on_my_wishlist() throws Throwable {
        MyWishListScreen screen = PageFactory.initElements(driver, MyWishListScreen.class);
        screen.ClickMyWishlist();
        screen.VerifyMyWishListItem();

        MyDashboardScreen Screen = PageFactory.initElements(driver, MyDashboardScreen.class);
        Screen.ClickSignOut();

    }

}

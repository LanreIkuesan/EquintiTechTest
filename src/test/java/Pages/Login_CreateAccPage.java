package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_CreateAccPage {



    @FindBy(how= How.NAME, using = "email_create")
    public static WebElement emailCreate;

    @FindBy(how= How.NAME, using = "SubmitCreate")
    public static WebElement CreateAccButton;

    @FindBy(how= How.NAME, using = "passwd")
    public static WebElement Password;
    @FindBy(how= How.NAME, using = "SubmitLogin")
    public static WebElement LoginButton;



    public void typeCreateEmail(){emailCreate.sendKeys("lanre.ikuesan@proactis.com");}
    public void ClickCreate(){CreateAccButton.click();}

}


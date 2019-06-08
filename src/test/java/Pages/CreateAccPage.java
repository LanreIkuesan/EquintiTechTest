package Pages;

import Base.TestBase;
import cucumber.api.java.hr.Ali;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccPage extends TestBase {
    @FindBy(how= How.ID, using = "id_gender1")
    public static WebElement Gender1;

    @FindBy(how= How.ID, using = "customer_firstname")
    public static WebElement FirstName;

    @FindBy(how= How.ID, using = "customer_lastname")
    public static WebElement LastName;

    @FindBy(how= How.ID, using = "passwd")
    public static WebElement Password;

    @FindBy(how= How.ID, using = "address1")
    public static WebElement Address;

    @FindBy(how= How.NAME, using = "city")
    public static WebElement City;

    @FindBy(how= How.NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how= How.ID, using = "phone_mobile")
    public static WebElement MobilePhone;

    @FindBy(how= How.ID, using = "alias")
    public static WebElement Alias;

    @FindBy(how= How.ID, using = "submitAccount")
    public static WebElement Register;

    @FindBy(how= How.ID, using = "postcode")
    public static WebElement PostCode;


    public void SelectGender(){Gender1.click();}
    public void TypeFirstname(){FirstName.sendKeys("Jeff");}
    public void TypeLastName(){LastName.sendKeys("Joe");}
    public void TypePassword(){Password.sendKeys("olanrewaju");}
    public void TypeAddress(){Address.sendKeys("2 Church Road, ");}
    public void TypeCity(){City.sendKeys("Chicago ");}
    public void TypePostcode(){PostCode.sendKeys("00000");}
    public void TypeMobilePhone(){MobilePhone.sendKeys("123456789");}
    public void ClearAliasField(){Alias.clear();}
    public void TypeAlias(){Alias.sendKeys("Armley");}
    public void clickRegister(){Register.click();}

}

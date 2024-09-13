package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateANewUserPage extends BasePage
{
	public WebDriver driver;

	public CreateANewUserPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//div[@id='header-offer-bar']")
@CacheLookup
WebElement headerofferbar;

@FindBy(xpath="//span[@id='sign-in-toggle']")
@CacheLookup
WebElement signIn;

@FindBy(xpath="//html")
@CacheLookup
WebElement htmlElement;

@FindBy(xpath="//body")
@CacheLookup
WebElement bodyElement;

@FindBy(xpath="//span[normalize-space()='Why you should create an account']")
@CacheLookup
WebElement whyYouShouldCreateAnAccou;

@FindBy(xpath="//input[@role='main']")
@CacheLookup
WebElement main;

@FindBy(xpath="//input[@formcontrolname='lastName']")
@CacheLookup
WebElement lastName;

@FindBy(xpath="//input[@formcontrolname='email']")
@CacheLookup
WebElement email;

@FindBy(xpath="//input[@id='reg-form-password']")
@CacheLookup
WebElement regformpassword;

@FindBy(xpath="//div[@class='placeholder bold']")
@CacheLookup
WebElement country_India;

@FindBy(xpath="//div[@class='consent-container ng-touched ng-pristine ng-invalid']//div[1]//label[1]//span[1]")
@CacheLookup
WebElement radio_no;

@FindBy(xpath="//button[@id='create-account-button']")
@CacheLookup
WebElement createAccount;

@FindBy(xpath="//input[@name='otpCode']")
@CacheLookup
WebElement otpCode;

@FindBy(xpath="//button[normalize-space()='Submit']")
@CacheLookup
WebElement submit;

@FindBy(xpath="//div[@class='title']")
@CacheLookup
WebElement thankYouForRegistration;
	
public boolean acknowledgment()
{
	//hi
	boolean status = thankYouForRegistration.isDisplayed();
	return status;
}
}



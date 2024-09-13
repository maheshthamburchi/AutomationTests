package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class CreateANewUserPage extends BasePage
{
	public WebDriver driver;

	public CreateANewUserPage(WebDriver driver)
	{
		super(driver);
	}
	

//@FindBy(xpath="//div[@id='header-offer-bar']")
//@CacheLookup
//WebElement headerofferbar;
@FindBy(xpath = "//button[(text()='Accept All')]")
@CacheLookup
WebElement accept_Coockie;

public void accept_All() 
{
	accept_Coockie.click();
	
}
	
@FindBy(xpath="//span[@id='sign-in-toggle']")
@CacheLookup
WebElement signIn;

public void ClickOn_signIn()
{
	
	signIn.click();
}
@FindBy(xpath="//li[@id='sign-in']//a[normalize-space()='Create Account']") 
@CacheLookup private 
WebElement createAccount_Link;

public void ClickOn_CreateAccount_Link() 
{
	createAccount_Link.click();
}

@FindBy(xpath="//span[normalize-space()='Why you should create an account']")
@CacheLookup
WebElement whyYouShouldCreateAnAccou;

public boolean verify_Question_Text()
{
	boolean question_Status = whyYouShouldCreateAnAccou.isDisplayed();
	return question_Status;
}



@FindBy(xpath="//input[@role='main']")
@CacheLookup
WebElement first_Name;

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




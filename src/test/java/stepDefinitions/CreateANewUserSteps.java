package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.CreateANewUserPage;

public class CreateANewUserSteps 
{
	public CreateANewUserPage canp;
	
	@Given("User navigates to Create a New Page")
	public void user_navigates_to_create_a_new_page() 
	{
		canp=new CreateANewUserPage(BaseClass.getDriver());
		System.out.println("User navigates **********");
	}

	@Then("User should handle the Popup Alert window")
	public void user_should_handle_the_popup_alert_window() 
	{
		  canp.accept_All();
		  System.out.println("User Accepted all coockies **********");
	}

	@Then("User should click on Sign in button")
	public void user_should_click_on_sign_in_button() throws InterruptedException 
	{
		canp.ClickOn_signIn();
	   System.out.println("User clicked on sign in **********");
	}

	@Then("User should click on Create Account link")
	public void user_should_click_on_create_account_link() 
	{
		canp.ClickOn_CreateAccount_Link();   
		System.out.println("User clicked on create acc link **********");
	}


	@Then("User should verify the page is landed to {string}")
	public void user_should_verify_the_page_is_landed_to(String string) 
	{
		boolean status = canp.verify_Question_Text();
		System.out.println("*********&&&&&"+status);
		Assert.assertTrue("The status of the value is", status);
		System.out.println("User have asked question **********");
	}

	@When("User should enter the following details to create a New User")
	public void user_should_enter_the_following_details_to_create_a_new_user(io.cucumber.datatable.DataTable dataTable)
	{
		
	Map<String, String> data = dataTable.asMap(String.class, String.class);
	
            
            WebElement inputField1=canp.first_Name;
            inputField1.sendKeys(data.get("Fname"), Keys.TAB);
            
            WebElement inputField2=canp.lastName;
            inputField2.sendKeys(data.get("Last name"), Keys.TAB);

            WebElement inputField3=canp.email;
            inputField3.sendKeys(data.get("Email"), Keys.TAB);
            
            WebElement inputField4=canp.regformpassword;
            inputField4.sendKeys(data.get("Password"), Keys.TAB);
                        
            // Find the corresponding input field by its name and enter the value
            // WebElement inputField = BaseClass.getDriver().findElement(By.name(field));
            //inputField.sendKeys(value);
		
		
		
		/*for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) 
		{
            String fieldName = row.get("Fields");
            String value = row.get("Values");
           //String fieldName = row.get("Fname");
           //String value = row.get("Testing");
            WebElement inputField;
            switch (fieldName) 
            {
                case "Fname":
                	 inputField=canp.first_Name;
                	 inputField.sendKeys(value);
                 //   inputField = BaseClass.getDriver().findElement(By.xpath("//input[@role='main']")); // Replace with your actual locator
                    break;
                case "Last name":
                    inputField = canp.lastName; // Replace with your actual locator
                    inputField.sendKeys(value);
                    break;
                case "Email":
                    inputField = canp.email; // Replace with your actual locator
                    inputField.sendKeys(value);
                    break;
                case "Password":
                    inputField = canp.regformpassword; // Replace with your actual locator
                    inputField.sendKeys(value);
                    break;
                //default:
                  //  throw new IllegalArgumentException("Unexpected field name: " + fieldName);
            }
           // inputField.sendKeys(value);
        }  */  
		System.out.println(Keys.TAB);
        System.out.println(Keys.ARROW_RIGHT);
            System.out.println("*************All input data inserted");
            
         }
	

	@Then("User should select radio button")
	public void user_should_select_radio_button() throws Exception 
	{
		canp.scrollToView(canp.createAccount);
	    canp.radio_Button_NO();
	    System.out.println("User clicked on NO radio button******");
	}

	@Then("User should click on Create account button")
	public void user_should_click_on_create_account_button() 
	{
		canp.createAccount_Button();
	    System.out.println("User clicked on CreateAccount button******");
	}
	
	@Then("User should verify the Page Title as of {string}")
	public void user_should_verify_the_page_title_as_of(String string) 
	{
	    
	}
	
	@Then("User should click on Submit button")
	public void user_should_click_on_submit_button() 
	{
	    
	}

	@Then("User should verify the {string} text")
	public void user_should_verify_the_text(String string) 
	{
	    
	}

	@Then("User should verify the confirmation message")
	public void user_should_verify_the_confirmation_message() 
	{
	    
	}

	@Then("User should verify the {string} message")
	public void user_should_verify_the_message(String string)
	{
	    
	}

	@When("User should click on {string} link")
	public void user_should_click_on_link(String string) 
	{
	   
	}
	

	@Then("User should verify the page title as {string}")
	public void user_should_verify_the_page_title_as(String string)
	{
	    
	}

	@When("User should click on Account")
	public void user_should_click_on_account() 
	{
	    
	}

	@Then("User verify the Sign Out link")
	public void user_verify_the_sign_out_link() 
	{
	    
	}

	@Then("Finally User should close the WebBrowser")
	public void finally_user_should_close_the_web_browser() 
	{
	    
	}
}

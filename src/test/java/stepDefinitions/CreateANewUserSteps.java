package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.CreateANewUserPage;

public class CreateANewUserSteps 
{
	public CreateANewUserPage canp;
	
	@Given("User navigates to Create a New Page")
	public void user_navigates_to_create_a_new_page() 
	{
		canp=new CreateANewUserPage(BaseClass.getDriver())
	}

	@Then("User should handle the Popup Alert window")
	public void user_should_handle_the_popup_alert_window() 
	{
	    
	}

	@Then("User should click on Sign in button")
	public void user_should_click_on_sign_in_button() 
	{
	   
	}

	@Then("User should click on Create Account link")
	public void user_should_click_on_create_account_link() 
	{
	    
	}

	@Then("User should verify the Page Title as {string}")
	public void user_should_verify_the_page_title_as(String string)
	{
	    
	}

	@Then("User should verify the page is landed to {string}")
	public void user_should_verify_the_page_is_landed_to(String string) 
	{
	    
	}

	@When("User should enter the following details to create a New User")
	public void user_should_enter_the_following_details_to_create_a_new_user(io.cucumber.datatable.DataTable dataTable)
	{
	    
	}

	@Then("User should select radio button")
	public void user_should_select_radio_button() 
	{
	    
	}

	@Then("User should click on Create account button")
	public void user_should_click_on_create_account_button() 
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

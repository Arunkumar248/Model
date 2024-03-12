package com.orangehrm.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.orangehrm.constants.Constants;
import com.orangehrm.page_objects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Swag_Labs_Login_Functionality {
	@Given("I am on the Swag Labs login page")
	public void i_am_on_the_Swag_Labs_login_page() {
		OrangeHRM_Common_Step_def.driver.get(Constants.APP_URL);
		
	}

	@When("I enter valid login credentials on the Swag labs Login Page.")
	public void i_enter_valid_login_credentials_on_the_Swag_labs_Login_Page() {
		PageFactory.initElements(OrangeHRM_Common_Step_def.driver, LoginPage.class);
		LoginPage.USERNAME.sendKeys(Constants.UserName);
		LoginPage.PASSWORD.sendKeys(Constants.Password);		
	}

	@When("click on the login button on the Swag labs Login Page.")
	public void click_on_the_login_button_on_the_Swag_labs_Login_Page() {
		LoginPage.LOGIN_BUTTON.click();
	}

	@Then("I should be able to see logo name as {string}.")
	public void i_should_be_able_to_see_logo_name_as(String expectedResult) {
		String actualResult = LoginPage.LOGO.getText();
		System.out.println(actualResult);
		if (expectedResult.equalsIgnoreCase(actualResult)) {
			
		}
		
	}

}

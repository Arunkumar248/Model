package com.orangehrm.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.constants.Constants;
import com.orangehrm.page_objects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login_Functionality_Step_def {
	
	
	@Given("I am on the OrangeHRM login page")
	public void i_am_on_the_OrangeHRM_login_page() {

		OrangeHRM_Common_Step_def.driver.get(Constants.APP_URL);
		System.out.println("I am on the OrangeHRM login page");
	}

	@When("I enter valid login credentials")
	public void i_enter_valid_login_credentials() {
		PageFactory.initElements(OrangeHRM_Common_Step_def.driver, LoginPage.class);
		LoginPage.USERNAME.sendKeys(Constants.UserName);
		LoginPage.PASSWORD.sendKeys(Constants.Password);
		System.out.println("I enter valid login credentials");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		LoginPage.LOGIN_BUTTON.click();
		System.out.println("click on the login button");
	}

	@Then("I should be redirected to the OrangeHRM dashboard")
	public void i_should_be_redirected_to_the_OrangeHRM_dashboard() {
		String Url = OrangeHRM_Common_Step_def.driver.getCurrentUrl();
		if (Url.contains("inventory")) {
			System.out.println("successfully redirected to the OrangeHRM dashboard");
		}
	}

	@When("I enter invalid login credentials")
	public void i_enter_invalid_login_credentials() {
		PageFactory.initElements(OrangeHRM_Common_Step_def.driver, LoginPage.class);
		LoginPage.USERNAME.sendKeys(Constants.UserName);
		LoginPage.PASSWORD.sendKeys(Constants.Password);
		System.out.println("I enter invalid login credentials");
	}

	@Then("I should see an error message on the login page")
	public void i_should_see_an_error_message_on_the_login_page() {
		System.out.println("I should see an error message on the login page");
	}

	@When("I leave the username and password fields empty")
	public void i_leave_the_username_and_password_fields_empty() {
		PageFactory.initElements(OrangeHRM_Common_Step_def.driver, LoginPage.class);
		LoginPage.USERNAME.sendKeys(Constants.UserName);
		LoginPage.PASSWORD.sendKeys(Constants.Password);
		System.out.println("I leave the username and password fields empty");
	}


}

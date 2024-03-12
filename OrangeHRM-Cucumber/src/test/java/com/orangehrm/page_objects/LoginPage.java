package com.orangehrm.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="user-name")
	public static WebElement USERNAME;
	
	@FindBy(id = "password")
	public static WebElement PASSWORD;
	
	@FindBy(id="login-button")
	public static WebElement LOGIN_BUTTON;
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
	public static WebElement LOGO;

}

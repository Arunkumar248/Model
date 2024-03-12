package com.orangehrm.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.orangehrm.utilities.CommomUtilis;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Common_Step_def {
	public static WebDriver driver;
	
	//public static final Logger LOGGER=Log
	@Before
	public void beforeScenario() {
		try {
			CommomUtilis properties=new CommomUtilis();
			properties.loadProperties();
			if (driver==null) {
				launchBrowser();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchBrowser() {
		try {
			switch ("chrome") {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case "IE":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

}

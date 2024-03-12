package com.orangehrm.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.orangehrm.constants.Constants;

public class CommomUtilis {
	
	public  void loadProperties(){
		
		
		Properties properties=new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.UserName=properties.getProperty("UserName");
		Constants.Password=properties.getProperty("Password");
		
//	FileReader reader1=new FileReader("config.properties");
//	Properties p=new Properties();
//	p.load(reader1);
//	p.getProperty("");
	
		
		
	}
	
	
}

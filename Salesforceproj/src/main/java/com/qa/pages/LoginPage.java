package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.elements.LoginPageElements;
import com.qa.elements.LogoutPageele;

public class LoginPage extends Base
{
	
	public LoginPage()  {
		PageFactory.initElements(driver,LoginPageElements.class);
		PageFactory.initElements(driver,LogoutPageele.class);

		driver.get(prop.getProperty("url"));
		
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	
	public void login(String un,String paswrd) {
	//	LoginPageElements.
		
	}

}

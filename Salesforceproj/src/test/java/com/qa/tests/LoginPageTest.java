package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.LoginPage;

public class LoginPageTest extends Base{
	
	LoginPage loginpage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		loginpage=new LoginPage();
		
	}
	@Test
	public void loginpageTitletest() {
		String title=loginpage.validateLoginPageTitle();
		//Assert.assertEquals(actual, expected);
	}

}

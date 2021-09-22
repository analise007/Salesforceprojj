package com.qa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.Base;

public class LoginPageElements extends Base
{
	
	@FindBy(name="username") public WebElement username;
	@FindBy(id="password") public WebElement password;
	@FindBy(id="Login") public WebElement login;
}

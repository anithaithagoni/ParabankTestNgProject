package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.webdriver.WebDriverClass;

public class LoginPage {
	
	@FindBy(xpath="//img[@class='logo']")
	private WebElement logo;
	
	
	
	
	public LoginPage getLoginPage() {
		return PageFactory.initElements(WebDriverClass.getDriver(), LoginPage.class);
	}

}

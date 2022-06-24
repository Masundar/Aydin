package org.pom;

import org.Baseclass.Methods;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends Methods {

	public login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement textUsername;

	@FindBy(id = "password")
	private WebElement txtpassword;

	@FindBy(id = "login")

	private WebElement btnlogin;

	public WebElement getTextUsername() {
		return textUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void logins(String username, String password) {
		System.out.println(username);
		type(getTextUsername(), username);

		type(getTxtpassword(), password);

		System.out.println(password);

		click(btnlogin);

	}

}

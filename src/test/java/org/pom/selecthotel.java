package org.pom;

import org.Baseclass.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotel extends Methods {
	
	
	public selecthotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "radiobutton_0")
	private WebElement clickradiobutton;

	@FindBy(id = "continue")
	private WebElement clickbtnContinue;

	public WebElement getClickradiobutton() {
		return clickradiobutton;
	}

	public WebElement getClickbtnContinue() {
		return clickbtnContinue;
	}

	public void slcthotel() {
click(clickradiobutton);
click(clickbtnContinue);
	}
	
	
}

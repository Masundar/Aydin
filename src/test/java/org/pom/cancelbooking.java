package org.pom;

import org.Baseclass.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancelbooking extends Methods {
	
	
	public cancelbooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "order_id_text")
	private WebElement textorder;

	@FindBy(id = "Search_hotel_id")
	private WebElement btnsearch;

	@FindBy(id = "btn_id_611888")
	private WebElement cancelid;

	public WebElement getTextorder() {
		return textorder;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public WebElement getCancelid() {
		return cancelid;
	}
	
	public void cancel() {
		
		click(btnsearch);
		click(cancelid);
	}
	
	
	
	
	
}

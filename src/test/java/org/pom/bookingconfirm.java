package org.pom;

import java.io.IOException;

import org.Baseclass.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingconfirm extends Methods {

	public bookingconfirm() {
		PageFactory.initElements(driver, this);
	}

	public void BookingConfirm(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}

	public void bookingActivity(String sheetName, int rowNo, int cellNo) throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		//String orderNoNew = getAttributeWithValue(getOrderno());
		//System.out.println(orderNoNew);
		//writeData(sheetName, rowNo, cellNo, orderNoNew);
		
		
	}
    
    

}

		
	

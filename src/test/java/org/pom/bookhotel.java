package org.pom;

import org.Baseclass.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookhotel extends Methods {
	
	
	public bookhotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement textfirstname;

	@FindBy(id = "last_name")
	private WebElement textlastname;

	@FindBy(id = "address")
	private WebElement textaddress;

	@FindBy(id = "cc_num")
	private WebElement ccnumber;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement ccmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ccyear;

	@FindBy(id = "cc_cvv")
	private WebElement creditcvv;

	@FindBy(id = "book_now")
	private WebElement clickbooknow;

	public WebElement getTextfirst_name() {
		return textfirstname;
	}

	public WebElement getTextlast_name() {
		return textlastname;
	}

	public WebElement getTextaddress() {
		return textaddress;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCreditcvv() {
		return creditcvv;
	}

	public WebElement getClickbooknow() {
		return clickbooknow;
	}

	public void bkhotel(String textfirstname, String textlastname, String textaddress, String ccnumber, String cctype,
			String Ccmonth, String ccyear, String creditcvv) {
		type(getTextfirst_name(), textfirstname);
		type(getTextlast_name(), textlastname);
		type(getTextaddress(), textaddress);
		type(getCcnumber(), ccnumber);
		selectOptionText(getCctype(), cctype);
		selectOptionText(getCcmonth(), Ccmonth);
		selectOptionText(getCcyear(), ccyear);
		type(getCreditcvv(), creditcvv);
		click(clickbooknow);

	}

}

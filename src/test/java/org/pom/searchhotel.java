package org.pom;

import org.Baseclass.Methods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotel extends Methods {

	public searchhotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnlocation;

	@FindBy(id = "hotels")
	private WebElement dDnhotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")

	private WebElement dDnRoomNo;

	@FindBy(id = "datepick_in")
	private WebElement textcheckindate;

	@FindBy(id = "datepick_out")

	private WebElement textcheckoutdate;

	@FindBy(id = "adult_room")

	private WebElement dDnAdultPerRoom;

	@FindBy(id = "child_room")

	private WebElement dDnchildPerRoom;
	
	
	@FindBy(id = "Submit")

	private WebElement btnsearch;

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTextcheckindate() {
		return textcheckindate;
	}

	public WebElement getTextcheckoutdate() {
		return textcheckoutdate;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnchildPerRoom() {
		return dDnchildPerRoom;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public void hotels(String dDnlocation, String dDnhotels, String dDnRoomType, String dDnRoomNo,
			String textcheckindate, String textcheckoutdate, String dDnAdultPerRoom, String dDnchildPerRoom) {

		// Assert.assertTrue("verify search hotel page is open",
		// getUrl().contains("SearchHotel"));

		selectOptionText(getdDnlocation(), dDnlocation);

		selectOptionText(getdDnhotels(), dDnhotels);

		selectOptionText(getdDnRoomType(), dDnRoomType);

		selectOptionText(getdDnRoomNo(), dDnRoomNo);

		type(getTextcheckindate(), textcheckindate);

		type(getTextcheckoutdate(), textcheckoutdate);

		selectOptionText(getdDnAdultPerRoom(), dDnAdultPerRoom);

		selectOptionText(getdDnchildPerRoom(), dDnchildPerRoom);

			click(getBtnsearch());

	}

}
